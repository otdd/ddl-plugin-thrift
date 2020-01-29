package io.otdd.ddl.thrift.encoder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransport;

import io.otdd.ddl.plugin.DDLEncoder;
import io.otdd.ddl.thrift.SettingsUtil;
import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;
import io.otdd.ddl.thrift.grammar.ThriftLexer;
import io.otdd.ddl.thrift.grammar.ThriftParser;

public class ThriftDDLEncoder implements DDLEncoder {

	private static final Logger LOG = LogManager.getLogger();

	public ThriftDDLEncoder(){
	}
	
	public byte[] encodeRequest(String ddl,Map<String,String> protocolSettings) {
		try{
			InputStream stream = new ByteArrayInputStream(ddl.getBytes(StandardCharsets.UTF_8));
			ANTLRInputStream input = new ANTLRInputStream(stream);
			ThriftLexer lexer = new ThriftLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ThriftParser parser = new ThriftParser(tokens);
			
			ThriftReqListener listener = new ThriftReqListener(1,
					SettingsUtil.getProtoType(SettingsUtil.Type.REQ,protocolSettings),
					SettingsUtil.getTransType(SettingsUtil.Type.REQ,protocolSettings));
			parser.addParseListener(listener);
			ErrListener errorListener = new ErrListener();
			parser.addErrorListener(errorListener);
			parser.response(); // begin parsing at rule 'response'
			if(errorListener.hasErr){
				LOG.error("syntaxError");
				return null;
			}
			else{
				return listener.getBytes();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public byte[] encodeResponse(String ddl,Map<String,String> protocolSettings) {
		try{
			InputStream stream = new ByteArrayInputStream(ddl.getBytes(StandardCharsets.UTF_8));
			ANTLRInputStream input = new ANTLRInputStream(stream);
			ThriftLexer lexer = new ThriftLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ThriftParser parser = new ThriftParser(tokens);
			int seqId = 0;
			ThriftRespListener listener = new ThriftRespListener(seqId,
					SettingsUtil.getProtoType(SettingsUtil.Type.RESP,protocolSettings),
					SettingsUtil.getTransType(SettingsUtil.Type.RESP,protocolSettings));
			parser.addParseListener(listener);
			parser.response(); // begin parsing at rule 'response'
			return listener.getBytes();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	class ErrListener implements ANTLRErrorListener{

		public boolean hasErr = false;

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
			hasErr = true;
		}
		@Override
		public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
		}
		@Override
		public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
		}
		@Override
		public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
		}
	}

	public static void main(String args[]){
		ThriftDDLEncoder encoder = new ThriftDDLEncoder();
//		String reqddl = "test:{ 1<string>:\"805\", 2<struct>:{ 1<i32>:1, 2<string>:\"data\", 3<string>:\"opt data\"} }";
		String reqddl = "[request-line]\n" +
				"GET /reviews/0 HTTP/1.1";

		byte[] req = encoder.encodeRequest(reqddl,null);
		System.out.println(Arrays.toString(req));
		System.out.println(new String(req));

		String respddl = "test:{ 1<i32>:1, 2<string>:\"response_data\", 3<string>:\"opt data\" }";
		byte[] resp = encoder.encodeResponse(respddl,null);
		System.out.println(Arrays.toString(resp));
		System.out.println(new String(resp));
	}

}


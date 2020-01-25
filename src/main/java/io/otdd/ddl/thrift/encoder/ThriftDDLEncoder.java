package io.otdd.ddl.thrift.encoder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransport;

import io.otdd.ddl.plugin.DDLEncoder;
import io.otdd.ddl.thrift.SettingsUtil;
import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;
import io.otdd.ddl.thrift.grammar.ThriftLexer;
import io.otdd.ddl.thrift.grammar.ThriftParser;

public class ThriftDDLEncoder implements DDLEncoder {

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
			parser.response(); // begin parsing at rule 'response'
			return listener.getBytes();
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
	
	public static void main(String args[]){
		ThriftDDLEncoder encoder = new ThriftDDLEncoder();
		String reqddl = "test:{ 1<string>:\"805\", 2<struct>:{ 1<i32>:1, 2<string>:\"data\", 3<string>:\"opt data\"} }";
		byte[] req = encoder.encodeRequest(reqddl,null);
		System.out.println(Arrays.toString(req));
		System.out.println(new String(req));

		String respddl = "test:{ 1<i32>:1, 2<string>:\"response_data\", 3<string>:\"opt data\" }";
		byte[] resp = encoder.encodeResponse(respddl,null);
		System.out.println(Arrays.toString(resp));
		System.out.println(new String(resp));
	}

}

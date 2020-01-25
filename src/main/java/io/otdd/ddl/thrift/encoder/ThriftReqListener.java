package io.otdd.ddl.thrift.encoder;

import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;

import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;
import io.otdd.ddl.thrift.grammar.ThriftParser;
import io.otdd.ddl.thrift.grammar.ThriftParser.BodyContext;

public class ThriftReqListener extends ThriftListener{

	public ThriftReqListener(int thriftSeqId, ThriftProtocolType protoType,ThriftTransportType tansType) {
		super(thriftSeqId, protoType, tansType);
	}

	public void exitResponse(ThriftParser.ResponseContext ctx) {
		//parse the entire tree.
		try{
			this.methodName = ctx.getChild(0).getText();
			oprot.writeMessageBegin(new TMessage(methodName, TMessageType.CALL, seqid));
			VALUE_TYPE type = parseTreeToValueType(ctx.getChild(0));
			switch(type){
			case STRUCT:
				writeBodyElementWithoutBeginEnd((BodyContext)ctx.getChild(2));
				break;
			case UNKOWN:
				break;
			}
			oprot.writeMessageEnd();
			oprot.getTransport().flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

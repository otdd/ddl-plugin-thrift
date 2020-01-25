package io.otdd.ddl.thrift.encoder;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;

import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;
import io.otdd.ddl.thrift.grammar.ThriftParser;
import io.otdd.ddl.thrift.grammar.ThriftParser.BodyContext;

public class ThriftRespListener extends ThriftListener{
	public ThriftRespListener(int thriftSeqId, ThriftProtocolType protoType,ThriftTransportType tansType) {
		super(thriftSeqId, protoType,tansType);
	}
	
	public void exitResponse(ThriftParser.ResponseContext ctx) {
		//parse the entire tree.
		try{
			this.methodName = ctx.getChild(0).getText();
			oprot.writeMessageBegin(new TMessage(methodName, TMessageType.REPLY, seqid));
			oprot.writeStructBegin(STRUCT_DESC);
			
			int size=0;
			org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC;
			VALUE_TYPE type = parseTreeToValueType(ctx.getChild(0));
			switch(type){
			case BOOL:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeBoolWithoutField(ctx.getChild(2).getText());
				break;
			case BYTE:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BYTE, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeByteWithoutField(ctx.getChild(2).getText());
				break;
			case I8:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BYTE, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeI8WithoutField(ctx.getChild(2).getText());
				break;
			case I16:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I16, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeI16WithoutField(ctx.getChild(2).getText());
				break;
			case I32:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeI32WithoutField(ctx.getChild(2).getText());
				break;
			case I64:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I64, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeI64WithoutField(ctx.getChild(2).getText());
				break;
			case ENUM:
				//the success type is I32 in enum.
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeI32WithoutField(ctx.getChild(2).getText());
				break;
			case DOUBLE:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.DOUBLE, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeDoubleWithoutField(ctx.getChild(2).getText());
				break;
			case STRING:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRING, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeStringWithoutField(ctx.getChild(2).getText());
				break;
			case BINARY:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRING, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeBinaryWithoutField(ctx.getChild(2).getText());
				break;
			case STRUCT:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				writeBodyElement((BodyContext)ctx.getChild(2));
				break;
			case MAP:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.MAP, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				ParseTree mapType = ctx.getChild(0);
				ParseTree mapValue = ctx.getChild(2);
				size = getMapSize(mapValue);
				ParseTree mapKeyType = mapType.getChild(2);
				byte keyType = getThriftType(parseTreeToValueType(mapKeyType));
				ParseTree mapValueType = mapType.getChild(4);
				byte valueType = getThriftType(parseTreeToValueType(mapValueType));
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(keyType, valueType,size));
				writeMapValue(mapType,mapValue);
				oprot.writeMapEnd();
				break;
			case SET:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.SET, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				ParseTree setType = ctx.getChild(0);
				ParseTree setValue = ctx.getChild(2);
				size = getSetOrListSize(setValue);
				oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(getThriftType(parseTreeToValueType(setType.getChild(2))),size));
				writeSetOrListValue(setType,setValue);
				oprot.writeSetEnd();
				break;
			case LIST:
				SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.LIST, (short)0);
				oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
				ParseTree listType = ctx.getChild(0);
				ParseTree listValue = ctx.getChild(2);
				size = getSetOrListSize(listValue);
				oprot.writeListBegin(new org.apache.thrift.protocol.TList(getThriftType(parseTreeToValueType(listType.getChild(2))),size));
				writeSetOrListValue(listType,listValue);
				oprot.writeListEnd();
				break;
			case UNKOWN:
				break;
			}
			
			oprot.writeFieldEnd();
			oprot.writeFieldStop();
			oprot.writeStructEnd();
			oprot.writeMessageEnd();
			oprot.getTransport().flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

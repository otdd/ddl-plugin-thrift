package io.otdd.ddl.thrift.encoder;

import java.nio.ByteBuffer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TTransport;

import io.otdd.ddl.thrift.OtddThriftTransport;
import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;
import io.otdd.ddl.thrift.grammar.ThriftBaseListener;
import io.otdd.ddl.thrift.grammar.ThriftParser;
import io.otdd.ddl.thrift.grammar.ThriftParser.BasicElementContext;
import io.otdd.ddl.thrift.grammar.ThriftParser.BodyContext;
import io.otdd.ddl.thrift.grammar.ThriftParser.ListElementContext;
import io.otdd.ddl.thrift.grammar.ThriftParser.MapElementContext;
import io.otdd.ddl.thrift.grammar.ThriftParser.SetElementContext;

public class ThriftListener extends ThriftBaseListener{


	TProtocol oprot;
	TTransport trans;
	OtddThriftTransport otddTrans;

	protected int seqid = 1;
	protected String methodName = "otdd_thrift_mock_method";

	protected int bodyDepth = 0;

	protected org.apache.thrift.protocol.TStruct STRUCT_DESC = 
			new org.apache.thrift.protocol.TStruct("otdd_result");

	enum VALUE_TYPE{
		BOOL,
		BYTE,
		I8,
		I16,
		I32,
		I64,
		ENUM,
		DOUBLE,
		STRING,
		BINARY,
		MAP,
		SET,
		LIST,
		STRUCT,
		UNKOWN
	};

	public ThriftListener(int thriftSeqId,ThriftProtocolType protoType,ThriftTransportType tansType){
		this.seqid = thriftSeqId;
		otddTrans = new OtddThriftTransport();
		if(tansType==ThriftTransportType.RAW){
			trans = otddTrans;
		}
		else{
			trans = new TFramedTransport(otddTrans);
		}
		if(protoType==ThriftProtocolType.COMPACT){
			oprot = new TCompactProtocol(trans, -1, -1);
		}
		else{
			boolean strictRead_ = false;
			boolean strictWrite_ = true;
			oprot = new TBinaryProtocol(trans,-1, -1, strictRead_, strictWrite_);
		}
	}

	protected void writeBodyElementWithoutBeginEnd(BodyContext ctx) {

		try{
			int cnt = ctx.getChildCount();
			for(int i=0;i<cnt;i++){
				ParseTree tree = ctx.getChild(i);
				if(tree instanceof ThriftParser.BasicElementContext){
					writeBasicElement((ThriftParser.BasicElementContext)tree);
				}
				else if(tree instanceof ThriftParser.MapElementContext){
					writeMapElement((ThriftParser.MapElementContext)tree);
				}
				else if(tree instanceof ThriftParser.SetElementContext){
					writeSetElement((ThriftParser.SetElementContext)tree);
				}
				else if(tree instanceof ThriftParser.ListElementContext){
					writeListElement((ThriftParser.ListElementContext)tree);
				}
			}
			oprot.writeFieldStop();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeBodyElement(BodyContext ctx) {

		try{
			oprot.writeStructBegin(STRUCT_DESC);

			int cnt = ctx.getChildCount();
			for(int i=0;i<cnt;i++){
				ParseTree tree = ctx.getChild(i);
				if(tree instanceof ThriftParser.BasicElementContext){
					writeBasicElement((ThriftParser.BasicElementContext)tree);
				}
				else if(tree instanceof ThriftParser.MapElementContext){
					writeMapElement((ThriftParser.MapElementContext)tree);
				}
				else if(tree instanceof ThriftParser.SetElementContext){
					writeSetElement((ThriftParser.SetElementContext)tree);
				}
				else if(tree instanceof ThriftParser.ListElementContext){
					writeListElement((ThriftParser.ListElementContext)tree);
				}
			}

			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeListElement(ListElementContext ctx) {
		try{
			if(ctx.getChildCount()!=3){
				// error
				System.out.println("list element child count is not 3! cnt:"+ctx.getChildCount());
				return;
			}

			ParseTree listKey = ctx.getChild(0);
			ParseTree listType = listKey.getChild(2);

			ParseTree listValue = ctx.getChild(2);

			short seq = getListKeySeq(listKey);
			byte type = getListKeyType(listKey);

			int size = getSetOrListSize(listValue);

			org.apache.thrift.protocol.TField field = 
					new org.apache.thrift.protocol.TField("listFieldVal", org.apache.thrift.protocol.TType.LIST, seq);

			oprot.writeFieldBegin(field);
			oprot.writeListBegin(new org.apache.thrift.protocol.TList(type,size));

			writeSetOrListValue(listType,listValue);

			oprot.writeListEnd();
			oprot.writeFieldEnd();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeSetElement(SetElementContext ctx) {
		try{
			if(ctx.getChildCount()!=3){
				// error
				System.out.println("set element child count is not 3! cnt:"+ctx.getChildCount());
				return;
			}

			ParseTree setKey = ctx.getChild(0);
			ParseTree setType = setKey.getChild(2);

			ParseTree setValue = ctx.getChild(2);

			short seq = getSetKeySeq(setKey);
			byte type = getSetKeyType(setKey);

			int size = getSetOrListSize(setValue);

			org.apache.thrift.protocol.TField field = 
					new org.apache.thrift.protocol.TField("setFieldVal", org.apache.thrift.protocol.TType.SET, seq);

			oprot.writeFieldBegin(field);
			oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(type,size));

			writeSetOrListValue(setType,setValue);

			oprot.writeSetEnd();
			oprot.writeFieldEnd();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeSetOrListValue(ParseTree type, ParseTree setOrListValue) {
		for(int i=0;i<setOrListValue.getChildCount();i++){
			ParseTree tree = setOrListValue.getChild(i);
			if(tree instanceof ThriftParser.ContainerValueContext){
				writeContainerValue(type.getChild(2), tree);
			}
		}
	}

	protected void writeContainerValue(ParseTree containerValueType, ParseTree setOrListValueElement) {

		VALUE_TYPE type = parseTreeToValueType(containerValueType);
		int size = 0;
		try{
			switch(type){
			case SET:
				size = getSetOrListSize(setOrListValueElement.getChild(0));
				oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(getThriftType(parseTreeToValueType(containerValueType)),size));
				writeSetOrListValue(containerValueType,setOrListValueElement.getChild(0));
				oprot.writeSetEnd();
				break;
			case LIST:
				size = getSetOrListSize(setOrListValueElement.getChild(0));
				oprot.writeListBegin(new org.apache.thrift.protocol.TList(getThriftType(parseTreeToValueType(containerValueType)),size));
				writeSetOrListValue(containerValueType,setOrListValueElement.getChild(0));
				oprot.writeListEnd();
				break;
			case MAP:
				size = getMapSize(setOrListValueElement.getChild(0));

				ParseTree mapKeyType = containerValueType.getChild(2);
				byte keyType = getThriftType(parseTreeToValueType(mapKeyType));
				ParseTree mapValueType = containerValueType.getChild(4);
				byte valueType = getThriftType(parseTreeToValueType(mapValueType));
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(keyType, valueType,size));
				writeMapValue(containerValueType,setOrListValueElement.getChild(0));
				oprot.writeMapEnd();
				break;
			case STRUCT:
				writeBodyElement((BodyContext)setOrListValueElement.getChild(0));
				break;
			case UNKOWN:
				break;
			default:
				writeWithoutField(type,setOrListValueElement.getText());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeMapElement(MapElementContext ctx) {

		try{
			if(ctx.getChildCount()!=3){
				// error
				System.out.println("map element child count is not 3! cnt:"+ctx.getChildCount());
				return;
			}

			ParseTree mapKey = ctx.getChild(0);
			ParseTree mapType = mapKey.getChild(2);

			ParseTree mapValue = ctx.getChild(2);

			short seq = getMapKeySeq(mapKey);
			byte keyType = getMapKeyType(mapKey);
			byte valueType = getMapValueType(mapKey);

			int size = getMapSize(mapValue);

			org.apache.thrift.protocol.TField field = 
					new org.apache.thrift.protocol.TField("mapFieldVal", org.apache.thrift.protocol.TType.MAP, seq);

			oprot.writeFieldBegin(field);
			oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(keyType, valueType,size));

			writeMapValue(mapType,mapValue);

			oprot.writeMapEnd();
			oprot.writeFieldEnd();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	protected void writeMapValue(ParseTree mapType, ParseTree mapValue) {
		for(int i=0;i<mapValue.getChildCount();i++){
			ParseTree tree = mapValue.getChild(i);
			if(tree instanceof ThriftParser.MapValueElementContext){
				writeMapValueElement(mapType, tree);
			}
		}
	}

	protected void writeMapValueElement(ParseTree mapType, ParseTree mapElement) {

		VALUE_TYPE keyType = parseTreeToValueType(mapType.getChild(2));
		VALUE_TYPE valueType = parseTreeToValueType(mapType.getChild(4));
		//write key
		writeWithoutField(keyType,mapElement.getChild(0).getText());
		//write value
		ParseTree value = mapElement.getChild(2);
		writeContainerValue(mapType.getChild(4),value);
	}

	protected void writeBasicElement(BasicElementContext ctx) {

		try{
			if(ctx.getChildCount()!=3){
				// error
				System.out.println("basic element child count is not 3! cnt:"+ctx.getChildCount());
				return;
			}
			ParseTree basicKey = ctx.getChild(0);
			short seq = getBasicKeySeq(basicKey);
			VALUE_TYPE type = getBasicKeyType(basicKey);
			ParseTree basicValue = ctx.getChild(2);

			if(type==VALUE_TYPE.STRUCT){
				org.apache.thrift.protocol.TField field = 
						new org.apache.thrift.protocol.TField("structFieldVal", org.apache.thrift.protocol.TType.STRUCT, seq);
				oprot.writeFieldBegin(field);

				writeBodyElement((BodyContext)basicValue);

				oprot.writeFieldEnd();

			}
			else{
				writeWithField(seq,type,basicValue.getText());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	protected short getSetKeySeq(ParseTree setKey) {
		ParseTree seq = setKey.getChild(0);
		return Short.parseShort(seq.getText());
	}

	protected byte getSetKeyType(ParseTree setKey) {
		ParseTree setType = setKey.getChild(2);
		ParseTree setKeyType = setType.getChild(2);
		return getThriftType(parseTreeToValueType(setKeyType));
	}

	protected int getSetOrListSize(ParseTree setValue) {
		int size = 0;
		for(int i=0;i<setValue.getChildCount();i++){
			ParseTree tree = setValue.getChild(i);
			if(tree instanceof ThriftParser.ContainerValueContext){
				size++;
			}
		}
		return size;
	}

	protected short getListKeySeq(ParseTree listKey) {
		ParseTree seq = listKey.getChild(0);
		return Short.parseShort(seq.getText());
	}

	protected byte getListKeyType(ParseTree listKey) {
		ParseTree listType = listKey.getChild(2);
		ParseTree listKeyType = listType.getChild(2);
		return getThriftType(parseTreeToValueType(listKeyType));
	}

	protected short getMapKeySeq(ParseTree mapKey) {
		ParseTree seq = mapKey.getChild(0);
		return Short.parseShort(seq.getText());
	}

	protected byte getMapKeyType(ParseTree mapKey) {
		ParseTree mapType = mapKey.getChild(2);
		ParseTree mapKeyType = mapType.getChild(2);
		return getThriftType(parseTreeToValueType(mapKeyType));
	}

	protected byte getMapValueType(ParseTree mapKey) {
		ParseTree mapType = mapKey.getChild(2);
		ParseTree mapKeyType = mapType.getChild(4);
		return getThriftType(parseTreeToValueType(mapKeyType));
	}

	protected int getMapSize(ParseTree mapValue) {
		int size = 0;
		for(int i=0;i<mapValue.getChildCount();i++){
			ParseTree tree = mapValue.getChild(i);
			if(tree instanceof ThriftParser.MapValueElementContext){
				size++;
			}
		}
		return size;
	}



	protected VALUE_TYPE getBasicKeyType(ParseTree basicKey) {
		VALUE_TYPE ret = VALUE_TYPE.UNKOWN;
		if(basicKey.getChildCount()==2){
			ParseTree basicType = basicKey.getChild(1);
			if(basicType.getChildCount()==3){
				ParseTree actualType = basicType.getChild(1);
				return parseTreeToValueType(actualType);
			}
		}
		return ret;
	}

	protected VALUE_TYPE parseTreeToValueType(ParseTree actualType) {
		if(actualType instanceof ThriftParser.BoolTypeContext){
			return VALUE_TYPE.BOOL;
		}
		if(actualType instanceof ThriftParser.ByteTypeContext){
			return VALUE_TYPE.BYTE;
		}
		if(actualType instanceof ThriftParser.I8TypeContext){
			return VALUE_TYPE.I8;
		}
		if(actualType instanceof ThriftParser.I16TypeContext){
			return VALUE_TYPE.I16;
		}
		if(actualType instanceof ThriftParser.I32TypeContext){
			return VALUE_TYPE.I32;
		}
		if(actualType instanceof ThriftParser.I64TypeContext){
			return VALUE_TYPE.I64;
		}
		if(actualType instanceof ThriftParser.EnumTypeContext){
			return VALUE_TYPE.ENUM;
		}
		if(actualType instanceof ThriftParser.DoubleTypeContext){
			return VALUE_TYPE.DOUBLE;
		}
		if(actualType instanceof ThriftParser.StringTypeContext){
			return VALUE_TYPE.STRING;
		}
		if(actualType instanceof ThriftParser.BinaryTypeContext){
			return VALUE_TYPE.BINARY;
		}
		if(actualType instanceof ThriftParser.MapTypeContext){
			return VALUE_TYPE.MAP;
		}
		if(actualType instanceof ThriftParser.SetTypeContext){
			return VALUE_TYPE.SET;
		}
		if(actualType instanceof ThriftParser.ListTypeContext){
			return VALUE_TYPE.LIST;
		}
		if(actualType instanceof ThriftParser.BodyTypeContext){
			return VALUE_TYPE.STRUCT;
		}
		return VALUE_TYPE.UNKOWN;
	}

	protected short getBasicKeySeq(ParseTree basicKey) {
		ParseTree seq = basicKey.getChild(0);
		return Short.parseShort(seq.getText());
	}

	protected void writeBinaryWithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("binaryFieldVal", org.apache.thrift.protocol.TType.STRING, seq);
		oprot.writeFieldBegin(field);

		writeBinaryWithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeBinaryWithoutField(String text) throws TException {
		if(text.startsWith("\"")&&text.endsWith("\"")){
			text = text.substring(1,text.length()-1);
		}
		ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
		oprot.writeBinary(buffer);
	}

	protected void writeStringWithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("stringFieldVal", org.apache.thrift.protocol.TType.STRING, seq);
		oprot.writeFieldBegin(field);

		writeStringWithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeStringWithoutField(String text) throws TException {
		if(text.startsWith("\"")&&text.endsWith("\"")){
			text = text.substring(1,text.length()-1);
			oprot.writeString(text);
		}
		else{
			oprot.writeString(text);
		}
	}

	protected void writeDoubleWithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("doubleFieldVal", org.apache.thrift.protocol.TType.DOUBLE, seq);
		oprot.writeFieldBegin(field);

		writeDoubleWithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeDoubleWithoutField(String text) throws TException {
		double d = Double.parseDouble(text);
		oprot.writeDouble(d);
	}

	protected void writeI64WithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("i64FieldVal", org.apache.thrift.protocol.TType.I64, seq);
		oprot.writeFieldBegin(field);

		writeI64WithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeI64WithoutField(String text) throws TException {
		long i64 = Long.parseLong(text);
		oprot.writeI64(i64);
	}

	protected void writeI32WithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("i32FieldVal", org.apache.thrift.protocol.TType.I32, seq);
		oprot.writeFieldBegin(field);

		writeI32WithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeI32WithoutField(String text) throws TException {
		int i32 = Integer.parseInt(text);
		oprot.writeI32(i32);
	}

	protected void writeI16WithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("i16FieldVal", org.apache.thrift.protocol.TType.I16, seq);
		oprot.writeFieldBegin(field);

		writeI16WithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeI16WithoutField(String text) throws TException {
		int i16 = Integer.parseInt(text);
		oprot.writeI16((short)i16);
	}

	protected void writeI8WithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("i8FieldVal", org.apache.thrift.protocol.TType.BYTE, seq);
		oprot.writeFieldBegin(field);

		writeI8WithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeI8WithoutField(String text) throws TException {
		if(text.contains("'")){//char
			String ch = text.substring(1,text.length()-1);
			oprot.writeByte((byte)ch.charAt(0));
		}
		else{
			int i8 = Integer.parseInt(text);
			oprot.writeByte((byte)i8);
		}
	}

	protected void writeByteWithField(short seq, String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("byteFieldVal", org.apache.thrift.protocol.TType.BYTE, seq);
		oprot.writeFieldBegin(field);

		writeByteWithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeByteWithoutField(String text) throws TException {
		String ch = text.substring(1,text.length()-1);
		oprot.writeByte((byte)ch.charAt(0));
	}

	protected void writeBoolWithField(short seq,String text) throws TException {
		org.apache.thrift.protocol.TField field = 
				new org.apache.thrift.protocol.TField("boolFieldVal", org.apache.thrift.protocol.TType.BOOL, seq);
		oprot.writeFieldBegin(field);

		writeBoolWithoutField(text);

		oprot.writeFieldEnd();
	}

	protected void writeBoolWithoutField(String text) throws TException {
		if("TRUE".equalsIgnoreCase(text)){
			oprot.writeBool(true);
		}
		else{
			oprot.writeBool(false);
		}
	}

	protected void writeWithoutField(VALUE_TYPE type, String value) {
		try{
			switch(type){
			case BOOL:
				writeBoolWithoutField(value);
				break;
			case BYTE:
				writeByteWithoutField(value);
				break;
			case I8:
				writeI8WithoutField(value);
				break;
			case I16:
				writeI16WithoutField(value);
				break;
			case I32:
				writeI32WithoutField(value);
				break;
			case I64:
				writeI64WithoutField(value);
				break;
			case ENUM:
				//enum is treated as i32
				writeI32WithoutField(value);
				break;
			case DOUBLE:
				writeDoubleWithoutField(value);
				break;
			case STRING:
				writeStringWithoutField(value);
				break;
			case BINARY:
				writeBinaryWithoutField(value);
				break;
			default:
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected void writeWithField(short seq, VALUE_TYPE type, String value) {
		try{
			switch(type){
			case BOOL:
				writeBoolWithField(seq,value);
				break;
			case BYTE:
				writeByteWithField(seq,value);
				break;
			case I8:
				writeI8WithField(seq,value);
				break;
			case I16:
				writeI16WithField(seq,value);
				break;
			case I32:
				writeI32WithField(seq,value);
				break;
			case I64:
				writeI64WithField(seq,value);
				break;
			case ENUM:
				//enum is treated as i32
				writeI32WithField(seq,value);
				break;
			case DOUBLE:
				writeDoubleWithField(seq,value);
				break;
			case STRING:
				writeStringWithField(seq,value);
				break;
			case BINARY:
				writeBinaryWithField(seq,value);
				break;
			default:
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	protected byte getThriftType(VALUE_TYPE type) {
		switch(type){
		case BOOL:
			return org.apache.thrift.protocol.TType.BOOL;
		case BYTE:
			return org.apache.thrift.protocol.TType.BYTE;
		case I8:
			return org.apache.thrift.protocol.TType.BYTE;
		case I16:
			return org.apache.thrift.protocol.TType.I16;
		case I32:
			return org.apache.thrift.protocol.TType.I32;
		case I64:
			return org.apache.thrift.protocol.TType.I64;
		case ENUM:
			return org.apache.thrift.protocol.TType.ENUM;
		case DOUBLE:
			return org.apache.thrift.protocol.TType.DOUBLE;
		case STRING:
			return org.apache.thrift.protocol.TType.STRING;
		case BINARY:
			return org.apache.thrift.protocol.TType.STRING;
		case MAP:
			return org.apache.thrift.protocol.TType.MAP;
		case SET:
			return org.apache.thrift.protocol.TType.SET;
		case LIST:
			return org.apache.thrift.protocol.TType.LIST;
		case STRUCT:
			return org.apache.thrift.protocol.TType.STRUCT;
		}
		return 0;
	}

	public byte[] getBytes() {
		return otddTrans.getBytes();
	}

}

package io.otdd.ddl.thrift.decoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TType;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TTransport;

import io.otdd.ddl.plugin.DDLDecoder;
import io.otdd.ddl.thrift.OtddThriftTransport;
import io.otdd.ddl.thrift.SettingsUtil;
import io.otdd.ddl.thrift.ThriftProtocolType;
import io.otdd.ddl.thrift.ThriftTransportType;

public class ThriftDDLDecoder implements DDLDecoder {

	@Override
	public String decodeRequest(byte[] respBytes,Map<String,String> protocolSettings) {
		StringBuilder sb = new StringBuilder();
		TTransport trans = null;
		TProtocol iprot = null;

		try{
			if(SettingsUtil.getTransType(SettingsUtil.Type.REQ,protocolSettings) == ThriftTransportType.RAW){
				trans = new OtddThriftTransport(respBytes);
			}
			else{
				trans = new TFramedTransport(new OtddThriftTransport(respBytes));
			}

			if(SettingsUtil.getProtoType(SettingsUtil.Type.REQ,protocolSettings)==ThriftProtocolType.COMPACT){
				iprot = new TCompactProtocol(trans,-1, -1);
			}
			else{
				boolean strictRead_ = false;
				boolean strictWrite_ = true;
				iprot = new TBinaryProtocol(trans,-1, -1, strictRead_, strictWrite_);
			}

			TMessage msg = iprot.readMessageBegin();
			if (msg.type == TMessageType.EXCEPTION) {
				TApplicationException x = new TApplicationException();
				x.read(iprot);
				iprot.readMessageEnd();
				throw x;
			}
			sb.append(msg.name);

			sb.append(":{\n");
			int index = 1;
			while (true)
			{
				TField schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}

				ThriftObject obj = readByType(iprot,schemeField.type);
				String str = getThriftObjectValuePrintStr(obj, 1);
				String indexStr = (index ++) + "<"+obj.typeStr+">:";
				generateTabs(sb, 0);
				sb.append(indexStr + str + ",\n");
			}
			iprot.readMessageEnd();
			sb.deleteCharAt(sb.lastIndexOf(","));
			return sb.toString() + "}";

		}
		catch(Exception e){
			return null;
		}
	}

	@Override
	public String decodeResponse(byte[] respBytes,Map<String,String> protocolSettings) {
		
		StringBuilder sb = new StringBuilder();
		TTransport trans = null;
		TProtocol iprot = null;

		try{
			if(SettingsUtil.getTransType(SettingsUtil.Type.RESP,protocolSettings) == ThriftTransportType.RAW){
				trans = new OtddThriftTransport(respBytes);
			}
			else{
				trans = new TFramedTransport(new OtddThriftTransport(respBytes));
			}

			if(SettingsUtil.getProtoType(SettingsUtil.Type.RESP,protocolSettings)==ThriftProtocolType.COMPACT){
				iprot = new TCompactProtocol(trans,-1, -1);
			}
			else{
				boolean strictRead_ = false;
				boolean strictWrite_ = true;
				iprot = new TBinaryProtocol(trans,-1, -1, strictRead_, strictWrite_);
			}

			TMessage msg = iprot.readMessageBegin();
			if (msg.type == TMessageType.EXCEPTION) {
				TApplicationException x = new TApplicationException();
				x.read(iprot);
				iprot.readMessageEnd();
				throw x;
			}
			sb.append(msg.name);
			sb.append(":");
			while (true)
			{
				TField schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}

				ThriftObject obj = readByType(iprot,schemeField.type);
				String str = getThriftObjectValuePrintStr(obj, 0);
				sb.append(str);
			}
			iprot.readMessageEnd();
			return sb.toString();
		}
		catch(Exception e){
			return null;
		}
	}
	
	private ThriftObject readByType(TProtocol iprot,byte type) throws TException {

		switch(type){
		case org.apache.thrift.protocol.TType.BOOL:
			return readBool(iprot);
		case org.apache.thrift.protocol.TType.BYTE:
			return readByte(iprot);
		case org.apache.thrift.protocol.TType.DOUBLE:
			return readDouble(iprot);
		case org.apache.thrift.protocol.TType.ENUM:
			return readEnum(iprot);
		case org.apache.thrift.protocol.TType.I16:
			return readI16(iprot);
		case org.apache.thrift.protocol.TType.I32:
			return readI32(iprot);
		case org.apache.thrift.protocol.TType.I64:
			return readI64(iprot);
		case org.apache.thrift.protocol.TType.LIST:
			return readList(iprot);
		case org.apache.thrift.protocol.TType.MAP:
			return readMap(iprot);
		case org.apache.thrift.protocol.TType.SET:
			return readSet(iprot);
		case org.apache.thrift.protocol.TType.STOP:
			return null;
		case org.apache.thrift.protocol.TType.STRING:
			return readString(iprot);
		case org.apache.thrift.protocol.TType.STRUCT:
			return readStruct(iprot);
		case org.apache.thrift.protocol.TType.VOID:
			return readVoid(iprot);
		}
		return null;
	}

	private ThriftObject readBool(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.BOOL;
		boolean value = iprot.readBool();
		obj.value = new Boolean(value);
		obj.typeStr = "bool";
		return obj;
	}

	private ThriftObject readByte(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.BYTE;
		byte value = iprot.readByte();
		obj.value = new Byte(value);
		obj.typeStr = "byte";
		return obj;
	}

	private ThriftObject readDouble(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.DOUBLE;
		double value = iprot.readDouble();
		obj.value = new Double(value);
		obj.typeStr = "double";
		return obj;
	}

	private ThriftObject readEnum(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.ENUM;
		int value = iprot.readI32();
		obj.value = new Integer(value);
		obj.typeStr = "enum";
		return obj;
	}

	private ThriftObject readI16(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.I16;
		short value = iprot.readI16();
		obj.value = new Short(value);
		obj.typeStr = "i16";
		return obj;
	}

	private ThriftObject readI32(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.I32;
		int i = iprot.readI32();
		obj.value = new Integer(i);
		obj.typeStr = "i32";
		return obj;
	}

	private ThriftObject readI64(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.I64;
		long value = iprot.readI64();
		obj.value = new Long(value);
		obj.typeStr = "i64";
		return obj;
	}

	private ThriftObject readString(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.STRING;
		String value = iprot.readString();
		obj.value = value;
		obj.typeStr = "string";
		return obj;
	}

	private ThriftObject readList(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.LIST;
		obj.value = new ArrayList<ThriftObject>();

		org.apache.thrift.protocol.TList list = iprot.readListBegin();
		obj.typeStr = "list<"+getTypeStr(list.elemType)+">";

		for (int i = 0; i < list.size; ++i)
		{
			((List)obj.value).add(readByType(iprot,list.elemType));
		}

		iprot.readListEnd();
		return obj;
	}

	private ThriftObject readSet(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.SET;
		obj.value = new ArrayList<ThriftObject>();
		org.apache.thrift.protocol.TSet set = iprot.readSetBegin();
		obj.typeStr = "set<"+getTypeStr(set.elemType)+">";
		for (int i = 0; i < set.size; ++i)
		{
			((List)obj.value).add(readByType(iprot,set.elemType));
		}
		iprot.readSetEnd();
		return obj;
	}

	private ThriftObject readMap(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.MAP;
		obj.value = new LinkedHashMap<ThriftObject,ThriftObject>();

		org.apache.thrift.protocol.TMap map = iprot.readMapBegin();
		obj.typeStr = "map<"+getTypeStr(map.keyType)+","+getTypeStr(map.valueType)+">";

		for (int i = 0; i < map.size; ++i)
		{
			((Map<ThriftObject,ThriftObject>)obj.value).put(readByType(iprot,map.keyType),readByType(iprot,map.valueType));
		}

		iprot.readMapEnd();
		return obj;
	}

	private ThriftObject readStruct(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.STRUCT;
		obj.value = new LinkedHashMap<Short,ThriftObject>();
		obj.typeStr = "struct";
		org.apache.thrift.protocol.TField schemeField;
		iprot.readStructBegin();
		while (true)
		{
			schemeField = iprot.readFieldBegin();
			if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
				break;
			}
			((LinkedHashMap<Short,ThriftObject>)obj.value).put(schemeField.id, readByType(iprot,schemeField.type));
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();
		return obj;
	}

	private ThriftObject readVoid(TProtocol iprot) throws TException {
		ThriftObject obj = new ThriftObject();
		obj.type = org.apache.thrift.protocol.TType.VOID;
		obj.value = null;
		return obj;
	}

	private String getThriftObjectValuePrintStr(ThriftObject obj, int depth){
		StringBuilder sb;
		int index = 0;
		switch(obj.type){
		case org.apache.thrift.protocol.TType.BOOL:
			if((Boolean)obj.value){
				return "true";
			}
			else{
				return "false";
			}
		case org.apache.thrift.protocol.TType.BYTE:
			return ""+(Byte)obj.value;
		case org.apache.thrift.protocol.TType.DOUBLE:
			return ""+(Double)obj.value;
		case org.apache.thrift.protocol.TType.ENUM:
			return ""+(Integer)obj.value;
		case org.apache.thrift.protocol.TType.I16:
			return ""+(Short)obj.value;
		case org.apache.thrift.protocol.TType.I32:
			return ""+(Integer)obj.value;
		case org.apache.thrift.protocol.TType.I64:
			return ""+(Long)obj.value;
		case org.apache.thrift.protocol.TType.LIST:
			sb = new StringBuilder();
			sb.append("[\n");
			List<ThriftObject> listValue = (List)obj.value;
			for(ThriftObject tmp:listValue){
				generateTabs(sb, depth);
				sb.append(getThriftObjectValuePrintStr(tmp, depth + 1));
				if(index<listValue.size()-1){
					sb.append(",");
				}
				index++;
				sb.append("\n");
			}
			generateTabs(sb, depth - 1);
			sb.append("]");
			return sb.toString();
		case org.apache.thrift.protocol.TType.MAP:
			sb = new StringBuilder();
			sb.append("{\n");
			Map<ThriftObject,ThriftObject> mapValue = (Map<ThriftObject,ThriftObject>)obj.value;
			for(Map.Entry<ThriftObject,ThriftObject> tmp:mapValue.entrySet()){
				generateTabs(sb, depth);
				sb.append(getThriftObjectValuePrintStr(tmp.getKey(), depth));
				sb.append(":");
				sb.append(getThriftObjectValuePrintStr(tmp.getValue(), depth));
				if(index<mapValue.size()-1){
					sb.append(",");
				}
				index++;
				sb.append("\n");
			}
			generateTabs(sb, depth - 1);
			sb.append("}");
			return sb.toString();
		case org.apache.thrift.protocol.TType.SET:
			sb = new StringBuilder();
			sb.append("[\n");
			List<ThriftObject> value = (List)obj.value;
			for(ThriftObject tmp:value){
				sb.append(getThriftObjectValuePrintStr(tmp, depth+1));
				if(index<value.size()-1){
					sb.append(",");
				}
				index++;
				sb.append("\n");
			}
			sb.append("]");
			return sb.toString();
		case org.apache.thrift.protocol.TType.STOP:
			return null;
		case org.apache.thrift.protocol.TType.STRING:
			return "\""+(String)obj.value+"\"";
		case org.apache.thrift.protocol.TType.STRUCT:
			sb = new StringBuilder();
			sb.append("{\n");
			Map<Short,ThriftObject> structValue = (Map<Short,ThriftObject>)obj.value;

			for(Map.Entry<Short,ThriftObject> tmp:structValue.entrySet()){
				String item = getThriftObjectValuePrintStr(
						tmp.getValue(),
						isCollectionType(tmp.getValue().type)? depth + 1 : depth
						);

				generateTabs(sb, depth);
				sb.append(""+tmp.getKey()+"<"+tmp.getValue().typeStr+">");
				sb.append(":");
				sb.append(item);
				if(index<structValue.size()-1){
					sb.append(",");
				}
				index++;
				sb.append("\n");
			}
			generateTabs(sb, depth - 1);
			sb.append("}");
			return sb.toString();
		case org.apache.thrift.protocol.TType.VOID:
			return "";
		}
		return null;
	}

	private boolean isCollectionType(byte type) {
		return type == TType.STRUCT || type == TType.LIST || type == TType.MAP || type == TType.SET;
	}

	private String getTypeStr(byte type) {
		switch(type){
		case org.apache.thrift.protocol.TType.BOOL:
			return "bool";
		case org.apache.thrift.protocol.TType.BYTE:
			return "byte";
		case org.apache.thrift.protocol.TType.DOUBLE:
			return "double";
		case org.apache.thrift.protocol.TType.ENUM:
			return "enum";
		case org.apache.thrift.protocol.TType.I16:
			return "i16";
		case org.apache.thrift.protocol.TType.I32:
			return "i32";
		case org.apache.thrift.protocol.TType.I64:
			return "i64";
		case org.apache.thrift.protocol.TType.LIST:
			return "list";
		case org.apache.thrift.protocol.TType.MAP:
			return "map";
		case org.apache.thrift.protocol.TType.SET:
			return "set";
		case org.apache.thrift.protocol.TType.STOP:
			return "stop";
		case org.apache.thrift.protocol.TType.STRING:
			return "string";
		case org.apache.thrift.protocol.TType.STRUCT:
			return "struct";
		case org.apache.thrift.protocol.TType.VOID:
			return "void";
		}
		return null;
	}

	private void generateTabs(StringBuilder sb, int depth) {
		while (depth-- >= 0) {
			sb.append("\t");
		}
	}

	public static void main(String args[]){
		ThriftDDLDecoder decoder = new ThriftDDLDecoder();
		byte[] respBytes = new byte[]{
				0, 0, 0, 63, -128, 1, 0, 2, 0, 0, 0, 4, 116, 101, 115, 116, 0, 0, 0, 1, 12, 0, 0, 8, 0, 1, 0, 0, 0, 1, 11, 0, 2, 0, 0, 0, 13, 114, 101, 115, 112, 111, 110, 115, 101, 95, 100, 97, 116, 97, 11, 0, 3, 0, 0, 0, 8, 111, 112, 116, 32, 100, 97, 116, 97, 0, 0
		};
		String resp = decoder.decodeResponse(respBytes,null);

		byte[] reqBytes = new byte[]{
				0, 0, 0, 64, -128, 1, 0, 1, 0, 0, 0, 4, 116, 101, 115, 116, 0, 0, 0, 1, 11, 0, 1, 0, 0, 0, 3, 56, 48, 53, 12, 0, 2, 8, 0, 1, 0, 0, 0, 1, 11, 0, 2, 0, 0, 0, 4, 100, 97, 116, 97, 11, 0, 3, 0, 0, 0, 8, 111, 112, 116, 32, 100, 97, 116, 97, 0, 0
		};
		String req = decoder.decodeRequest(reqBytes,null);
		System.out.println(req);
		System.out.println(resp);
	}

}

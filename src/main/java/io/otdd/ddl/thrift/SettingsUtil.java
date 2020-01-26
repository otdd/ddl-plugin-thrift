package io.otdd.ddl.thrift;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SettingsUtil {
	
	public enum Type{
		REQ,
		RESP
	}
	
	private static ThriftProtocolType currentReqProtocolType = ThriftProtocolType.BINARY;
	private static ThriftTransportType currentReqTransportType = ThriftTransportType.FRAMED;
	
	private static ThriftProtocolType currentRespProtocolType = currentReqProtocolType;
	private static ThriftTransportType currentRespTransportType = currentReqTransportType;
	
	
	public static Map<String, String> getReqProtocolSettings() {
		return getProtocolSettings(Type.REQ);
	}
	
	public static Map<String, String> getRespProtocolSettings() {
		return getProtocolSettings(Type.RESP);
	}
	
	private static Map<String, String> getProtocolSettings(Type type) {
		JSONObject json = new JSONObject();
		json.put("hint", "the thrift protocol.");
		json.put("type", "select");
		json.put("currentValue", 
				type==Type.REQ?currentReqProtocolType.name().toLowerCase():currentRespProtocolType.name().toLowerCase());
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("binary");
		jsonArray.add("compact");
		json.put("values", jsonArray);
		Map<String,String> ret = new HashMap<String,String>();
		ret.put("protocol",json.toString());
		
		json = new JSONObject();
		json.put("hint", "the thrift transport.");
		json.put("type", "select");
		json.put("currentValue", 
				type==Type.REQ?currentReqTransportType.name().toLowerCase():currentRespTransportType.name().toLowerCase());
		jsonArray = new JSONArray();
		jsonArray.add("raw");
		jsonArray.add("framed");
		json.put("values", jsonArray);
		ret.put("transport",json.toString());
		return ret;
	}
	
	public static void setDefaultSettings(Map<String, String> reqSettings,Map<String, String> respSettings){
		if(reqSettings!=null){
			String protocol = reqSettings.get("protocol");
			if("compact".equalsIgnoreCase(protocol)){
				currentReqProtocolType = ThriftProtocolType.COMPACT;
			}
			else{
				currentReqProtocolType = ThriftProtocolType.BINARY;
			}
			String transport = reqSettings.get("transport");
			if("raw".equalsIgnoreCase(transport)){
				currentReqTransportType = ThriftTransportType.RAW;
			}
			else{
				currentReqTransportType = ThriftTransportType.FRAMED;
			}
		}
		if(respSettings!=null){
			String protocol = respSettings.get("protocol");
			if("compact".equalsIgnoreCase(protocol)){
				currentRespProtocolType = ThriftProtocolType.COMPACT;
			}
			else{
				currentRespProtocolType = ThriftProtocolType.BINARY;
			}
			String transport = respSettings.get("transport");
			if("raw".equalsIgnoreCase(transport)){
				currentRespTransportType = ThriftTransportType.RAW;
			}
			else{
				currentRespTransportType = ThriftTransportType.FRAMED;
			}
		}
	}
	
	public static ThriftProtocolType getProtoType(Type type,Map<String, String> settings) {
		if(settings!=null){
			String protocol = settings.get("protocol");
			if("compact".equalsIgnoreCase(protocol)){
				return ThriftProtocolType.COMPACT;
			}
			else if("binary".equalsIgnoreCase(protocol)){
				return ThriftProtocolType.BINARY; 
			}
		}
		return type==Type.REQ?currentReqProtocolType:currentRespProtocolType;
	}
	public static  ThriftTransportType getTransType(Type type,Map<String, String> settings) {
		if(settings!=null){
			String transport = settings.get("transport");
			if("raw".equalsIgnoreCase(transport)){
				return ThriftTransportType.RAW;
			}
			else if("framed".equalsIgnoreCase(transport)){
				return ThriftTransportType.FRAMED;
			}
		}
		return type==Type.REQ?currentReqTransportType:currentRespTransportType;
	}

}

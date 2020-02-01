package io.otdd.ddl.thrift;

import java.util.Map;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import io.otdd.ddl.plugin.DDLCodecFactory;
import io.otdd.ddl.plugin.DDLDecoder;
import io.otdd.ddl.plugin.DDLEncoder;
import io.otdd.ddl.thrift.decoder.ThriftDDLDecoder;
import io.otdd.ddl.thrift.encoder.ThriftDDLEncoder;

public class ThriftDDLCodecFactoryPlugin extends Plugin {

	public ThriftDDLCodecFactoryPlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Extension
	public static class ThriftDDLCodecFactory implements DDLCodecFactory{

		public Map<String,String> getReqProtocolSettings(){
			return SettingsUtil.getReqProtocolSettings();
		}
		public Map<String,String> getRespProtocolSettings(){
			return SettingsUtil.getRespProtocolSettings();
		}
		
		public DDLDecoder getDecoder() {
			return new ThriftDDLDecoder();
		}

		public DDLEncoder getEncoder() {
			return new ThriftDDLEncoder();
		}
		
		public String getProtocolName() {
			return "thrift";
		}

		public String getPluginName() {
			return "otdd thrift plugin";
		}

		public String getPluginVersion() {
			return "0.1.0";
		}

		public boolean init(Map<String,String> reqProtocolSettings,
				Map<String,String> respProtocolSettings) {
			SettingsUtil.setDefaultSettings(reqProtocolSettings,respProtocolSettings);
			return true;
		}
		
		@Override
		public boolean updateSettings(Map<String, String> reqProtocolSettings,
				Map<String, String> respProtocolSettings) {
			SettingsUtil.setDefaultSettings(reqProtocolSettings,respProtocolSettings);
			return true;
		}

		public void destroy() {

		}
		
	}

}

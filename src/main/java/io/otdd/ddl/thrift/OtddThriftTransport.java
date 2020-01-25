package io.otdd.ddl.thrift;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class OtddThriftTransport extends TTransport {

	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	ByteArrayInputStream inputStream = null;

	public OtddThriftTransport(){
		
	}
	
	public OtddThriftTransport(byte[] readBytes){
		inputStream = new ByteArrayInputStream(readBytes);
	}
	
	@Override
	public boolean isOpen() {
		return true;
	}

	@Override
	public void open() throws TTransportException {
	}

	@Override
	public void close() {
	}

	@Override
	public int read(byte[] buf, int off, int len) throws TTransportException {
		if(inputStream==null){
			return 0;
		}
		return inputStream.read(buf, off, len);
	}
	
	@Override
	public void write(byte[] buf, int off, int len) throws TTransportException {
        outputStream.write(buf,off,len);
	}

	public byte[] getBytes(){
		return outputStream.toByteArray();
	}
}

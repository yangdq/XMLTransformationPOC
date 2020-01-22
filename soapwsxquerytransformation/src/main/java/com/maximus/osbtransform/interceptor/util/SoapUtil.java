package com.maximus.osbtransform.interceptor.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoapUtil {

	  public static void debugSoapMessage(MessageContext messageContext) throws IOException {
		    if(log.isDebugEnabled()) {
				SoapMessage message = (SoapMessage) messageContext.getRequest();
				String soapMsg = convertSoapMsgToString(message);
				//message.writeTo(System.out);
				log.debug("\nOriginalMessage = [\n" + soapMsg);
		    }	  
	  }
	  
	  public static String convertSoapMsgToString(SoapMessage message) throws IOException{
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			message.writeTo(stream);
			String soapString = new String(stream.toByteArray());	
			return soapString;
	  }
}

package com.maximus.osbtransform.interceptor.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;

import lombok.extern.slf4j.Slf4j;

/**
 * SOAP Message Operatoin Utility Class.
 * @author daniel
 *
 */
@Slf4j
public class SoapUtil {

	  public static void debugSoapMessage(SoapMessage message) throws IOException {
		    if(log.isDebugEnabled()) {
		    	//SoapMessage message = (SoapMessage) messageContext.getRequest();
				String soapMsg = convertSoapMsgToString(message);
				//message.writeTo(System.out);
				log.debug("\nMessage = [\n" + soapMsg);
		    }	  
	  }
	  
	  public static String convertSoapMsgToString(SoapMessage message) throws IOException{
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			message.writeTo(stream);
			String soapString = new String(stream.toByteArray());	
			return soapString;
	  }
	  
	  public static String findSOAPFieldValue(String soapMessageString, String field) {
		  String beginTag = "<" + field + ">";
		  String endTag = "</" + field + ">";
		  int beginIndex = soapMessageString.indexOf(beginTag) + field.length() + 2;
		  if(beginIndex != -1) {
			  int endIndex = soapMessageString.indexOf(endTag);
			  if(endIndex != -1) {
				  String value = soapMessageString.substring(beginIndex, endIndex);
				  return value;
			  }
		  }
		  return null;
	  }
}

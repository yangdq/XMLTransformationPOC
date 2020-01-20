package com.maximus.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;

@Component
public class VidaValidationInterceptor extends PayloadValidatingInterceptor
{
  private static final Log logger = LogFactory.getLog(VidaValidationInterceptor.class);

  
//  @Override
//  public boolean shouldIntercept(MessageContext messageContext, Object endpoint) {
//	  MethodEndpoint me = (MethodEndpoint) endpoint;
//	  if(me.getBean() instanceof OsbEndpoint) {
//		  return true;
//	  }
//	  else{
//		  return false;
//	  }
//  }

  @Override
  public boolean handleRequest(MessageContext messageContext, Object endpoint)
  {
		System.out.println("\n########################VidaValidationInterceptor handleRequest#################");
		SoapMessage message = (SoapMessage) messageContext.getRequest();
		StringWriter sr = new StringWriter();
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		try {
		message.writeTo(stream);
		String input = new String(stream.toByteArray());
		//message.writeTo(System.out);
		System.out.println("\nOriginalMessage = [\n" + input);
			
	    return super.handleRequest(messageContext, endpoint);
	}catch(Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e.getMessage());
	}
  }
  
  @Override
  public boolean handleResponse(MessageContext messageContext, Object endpoint)
  {
	  System.out.println("########################VidaValidationInterceptor handleResponse#################");
	  SoapMessage message = (SoapMessage) messageContext.getRequest();
	  ByteArrayOutputStream stream = new ByteArrayOutputStream();
	  try {
		  message.writeTo(stream);
		  String input = new String(stream.toByteArray());
		  //message.writeTo(System.out);
		  System.out.println("\nResponselMessage = [\n" + input);
			
		  return super.handleResponse(messageContext, endpoint);
	  }catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
  }
}


	

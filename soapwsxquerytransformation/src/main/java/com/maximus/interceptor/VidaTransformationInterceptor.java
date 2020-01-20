package com.maximus.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.interceptor.PayloadTransformingInterceptor;
import org.springframework.ws.soap.SoapMessage;

@Component
public class VidaTransformationInterceptor extends PayloadTransformingInterceptor
{
  private static final Log logger = LogFactory.getLog(VidaTransformationInterceptor.class);

  
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
    throws Exception
  {
	System.out.println("\n########################VidaTransformationInterceptor handleRequest#################");
	SoapMessage message = (SoapMessage) messageContext.getRequest();
	StringWriter sr = new StringWriter();
	ByteArrayOutputStream stream = new ByteArrayOutputStream();
	message.writeTo(stream);
	String input = new String(stream.toByteArray());
	//message.writeTo(System.out);
	System.out.println("\nOriginalMessage = [\n" + input);
		
   boolean result = super.handleRequest(messageContext, endpoint);
    
	message = (SoapMessage) messageContext.getRequest();
	System.out.println("\nTransformedMessage = [\n" );
	message.writeTo(System.out);
	
    return result;
  }
  
  @Override
  public boolean handleResponse(MessageContext messageContext, Object endpoint)
    throws Exception
  {
	  System.out.println("########################VidaTransformationInterceptor handleResponse#################");
	  SoapMessage message = (SoapMessage) messageContext.getRequest();
	  ByteArrayOutputStream stream = new ByteArrayOutputStream();
	  message.writeTo(stream);
	  String input = new String(stream.toByteArray());
	  //message.writeTo(System.out);
	  System.out.println("\nResponselMessage = [\n" + input);
		
	  return super.handleResponse(messageContext, endpoint);
  }
}


	

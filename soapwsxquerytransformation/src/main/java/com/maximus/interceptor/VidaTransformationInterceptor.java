package com.maximus.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.interceptor.PayloadTransformingInterceptor;
import org.springframework.ws.soap.SoapMessage;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
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
	log.info("\n########################VidaTransformationInterceptor handleRequest#################");
	SoapMessage message = (SoapMessage) messageContext.getRequest();
	StringWriter sr = new StringWriter();
	ByteArrayOutputStream stream = new ByteArrayOutputStream();
	message.writeTo(stream);
	String input = new String(stream.toByteArray());
	//message.writeTo(System.out);
	log.debug("\nOriginalMessage = [\n" + input);
		
   boolean result = super.handleRequest(messageContext, endpoint);
    
	message = (SoapMessage) messageContext.getRequest();
	log.debug("\nTransformedMessage = [\n" );
	message.writeTo(System.out);
	
    return result;
  }
  
  @Override
  public boolean handleResponse(MessageContext messageContext, Object endpoint)
    throws Exception
  {
	  log.info("########################VidaTransformationInterceptor handleResponse#################");
	  SoapMessage message = (SoapMessage) messageContext.getRequest();
	  ByteArrayOutputStream stream = new ByteArrayOutputStream();
	  message.writeTo(stream);
	  String input = new String(stream.toByteArray());
	  //message.writeTo(System.out);
	  log.debug("\nResponselMessage = [\n" + input);
		
	  return super.handleResponse(messageContext, endpoint);
  }
}


	

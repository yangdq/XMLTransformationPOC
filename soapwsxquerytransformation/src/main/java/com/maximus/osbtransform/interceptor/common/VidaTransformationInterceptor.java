package com.maximus.osbtransform.interceptor.common;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.interceptor.PayloadTransformingInterceptor;
import org.springframework.ws.soap.SoapMessage;

import com.maximus.osbtransform.interceptor.util.SoapUtil;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class VidaTransformationInterceptor extends PayloadTransformingInterceptor
{
//  private static final Log logger = LogFactory.getLog(VidaTransformationInterceptor.class);

  
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
	log.info("\n########################VidaTransformationInterceptor handleRequest#################\n");
	log.debug("\nOrignal Request Message = [\n");
	SoapUtil.debugSoapMessage((SoapMessage)messageContext.getRequest());
		
    boolean result = super.handleRequest(messageContext, endpoint);
    
    log.debug("\nTransformed Request Message = [\n");
	SoapUtil.debugSoapMessage((SoapMessage)messageContext.getRequest());

    return result;
  }
  
  @Override
  public boolean handleResponse(MessageContext messageContext, Object endpoint)
    throws Exception
  {
	  log.info("########################VidaTransformationInterceptor handleResponse#################");
	  log.debug("\nResponselMessage = [\n");
		SoapUtil.debugSoapMessage((SoapMessage)messageContext.getResponse());	
	  
	  boolean success = super.handleResponse(messageContext, endpoint);
	  log.debug("\nTransformed Response Message = [\n");
		SoapUtil.debugSoapMessage((SoapMessage)messageContext.getResponse());  
	  
	  return success;
  }
  
}


	

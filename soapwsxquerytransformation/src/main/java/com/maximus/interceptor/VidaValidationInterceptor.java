package com.maximus.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;

import com.maximus.interceptor.util.SoapUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class VidaValidationInterceptor extends PayloadValidatingInterceptor
{
//  private static final Log logger = LogFactory.getLog(VidaValidationInterceptor.class);
	
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
	log.info("\n########################VidaValidationInterceptor handleRequest#################");
	try {
		log.debug("\nRequest Message = [\n");
		SoapUtil.debugSoapMessage(messageContext);
			
	    return super.handleRequest(messageContext, endpoint);
	}catch(Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e.getMessage());
	}
  }
  
  @Override
  public boolean handleResponse(MessageContext messageContext, Object endpoint)
  {
	log.info("########################VidaValidationInterceptor handleResponse#################");
	try {
		log.debug("\nResponse Message = [\n");
		SoapUtil.debugSoapMessage(messageContext);
			
		return super.handleResponse(messageContext, endpoint);
	}catch(Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e.getMessage());
	}
  }
}


	

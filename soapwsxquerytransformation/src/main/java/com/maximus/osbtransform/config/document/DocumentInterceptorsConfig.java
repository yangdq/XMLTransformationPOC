package com.maximus.osbtransform.config.document;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;

import com.maximus.osbtransform.config.common.InterceptorsConfig;
import com.maximus.osbtransform.interceptor.common.VidaTransformationInterceptor;

@EnableWs
@Configuration
public class DocumentInterceptorsConfig extends InterceptorsConfig {
	    
	  @Bean
	  @Order(100)
	  public SmartEndpointInterceptor addVidaDocumentServiceInterceptor() {
			VidaTransformationInterceptor payloadGenericTransInterceptor = new VidaTransformationInterceptor();
			//PayloadTransformingInterceptor payloadTransInterceptor = new PayloadTransformingInterceptor();
			Resource requestXslt = new ClassPathResource("xslt/" + xsltRequestFile);
			payloadGenericTransInterceptor.setRequestXslt(requestXslt);
			Resource responseXslt = new ClassPathResource("xslt/" + xsltResponseFile);
			payloadGenericTransInterceptor.setResponseXslt(responseXslt);
			try{
				payloadGenericTransInterceptor.afterPropertiesSet();
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
			return new PayloadRootSmartSoapEndpointInterceptor(payloadGenericTransInterceptor,
					"http://webservice.flhk.com/DocumentServices/1.0", 
					"documentArrivedRequest");
	  }
	  
	  @Bean
	  @Order(100)
	  public SmartEndpointInterceptor addVidaAccountSearchInterceptor() {
			VidaTransformationInterceptor payloadGenericTransInterceptor = new VidaTransformationInterceptor();
			//PayloadTransformingInterceptor payloadTransInterceptor = new PayloadTransformingInterceptor();
			Resource requestXslt = new ClassPathResource("xslt/" + xsltRequestFile);
			payloadGenericTransInterceptor.setRequestXslt(requestXslt);
			Resource responseXslt = new ClassPathResource("xslt/" + xsltResponseFile);
			payloadGenericTransInterceptor.setResponseXslt(responseXslt);
			try{
				payloadGenericTransInterceptor.afterPropertiesSet();
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
			return new PayloadRootSmartSoapEndpointInterceptor(payloadGenericTransInterceptor,
					"http://webservice.flhk.com/DocumentServices/1.0", 
					"accountSearchRequest");
	  }
}

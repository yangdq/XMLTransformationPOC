package com.maximus.osbtransform.config.dataentry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.maximus.osbtransform.config.common.InterceptorsConfig;
import com.maximus.osbtransform.interceptor.LetterLoggingInterceptor;
import com.maximus.osbtransform.interceptor.common.VidaTransformationInterceptor;
import com.maximus.osbtransform.interceptor.common.VidaValidationInterceptor;

@EnableWs
@Configuration
public class DataEntryInterceptorsConfig extends InterceptorsConfig {
	
//	  @Bean
//	  @Order(1)  // Order does not really work.  But the bean definition order does work
//	  public SmartEndpointInterceptor inserDataEntryLoggingInterceptor() {
//		  LetterLoggingInterceptor loggingInterceptor = new LetterLoggingInterceptor();
//		  loggingInterceptor.setAsyncService(asyncService);
//		  
//			return new PayloadRootSmartSoapEndpointInterceptor(loggingInterceptor,
//					"http://webservice.flhk.com/DataEntryDailyBatchSchema/1.0", 
//					"viewDataEntryDailyBatchRequest");
//	  }
    
	  @Bean
	  @Order(10)
	  public SmartEndpointInterceptor insertDataEntnyValidationInterceptor() {
		    VidaValidationInterceptor validatingInterceptor = new VidaValidationInterceptor();
		    validatingInterceptor.setValidateRequest(true);
		    validatingInterceptor.setValidateResponse(true);
		    XsdSchema insertLetterPOFLinksSchema = insertLetterPOFLinksSchema();
		    validatingInterceptor.setXsdSchema(insertLetterPOFLinksSchema);
		    try {
		    	validatingInterceptor.afterPropertiesSet();
		    }catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
			return new PayloadRootSmartSoapEndpointInterceptor(validatingInterceptor,
					"http://webservice.flhk.com/DataEntryDailyBatchSchema/1.0", 
					"viewDataEntryDailyBatchRequest");
	  }	     
	  
	  @Bean
	  @Order(100)
	  public SmartEndpointInterceptor insertDataEntryTansformInterceptor() {
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
					"http://webservice.flhk.com/DataEntryDailyBatchSchema/1.0", 
					"viewDataEntryDailyBatchRequest");
	  }
	  

	  public XsdSchema insertLetterPOFLinksSchema() {
	    return new SimpleXsdSchema(new ClassPathResource(SCHEMA_LOCATION + "DataEntryDailyBatchSchema.xsd"));
	  }
	  
}

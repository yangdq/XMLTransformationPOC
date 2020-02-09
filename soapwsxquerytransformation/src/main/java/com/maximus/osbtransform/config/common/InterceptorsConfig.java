package com.maximus.osbtransform.config.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import com.maximus.osbtransform.service.async.AsyncService;

//@EnableWs
//@Configuration
public class InterceptorsConfig extends WsConfigurerAdapter {
	
    @Value("${xslt.request}")
    protected String xsltRequestFile;
    
    @Value("${xslt.response}")
    protected String xsltResponseFile;
    
	@Autowired
	protected AsyncService asyncService;	
    
    protected static final String SCHEMA_LOCATION = "wsdl/schemas/";
	
//	  @Override
//	  public void addInterceptors(List<EndpointInterceptor> interceptors) {
////	    PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
////	    validatingInterceptor.setValidateRequest(true);
////	    validatingInterceptor.setValidateResponse(true);
////	    validatingInterceptor.setXsdSchema(resourceSchema());
////	    interceptors.add(validatingInterceptor);
//		VidaTransformationInterceptor payloadTransInterceptor = new VidaTransformationInterceptor();
//		//PayloadTransformingInterceptor payloadTransInterceptor = new PayloadTransformingInterceptor();
//		Resource requestXslt = new ClassPathResource(xsltRequestFile);
//		payloadTransInterceptor.setRequestXslt(requestXslt);
//		Resource responseXslt = new ClassPathResource(xsltResponseFile);
//		payloadTransInterceptor.setResponseXslt(responseXslt);
//		try{
//			payloadTransInterceptor.afterPropertiesSet();
//		}catch(Exception e) {
//			throw new RuntimeException(e.getMessage());
//		}
//		interceptors.add(new PayloadRootSmartSoapEndpointInterceptor(
//				payloadTransInterceptor,
//				"http://webservice.flhk.com/FLHKWebService/1.0", "insertLetterPDFLinks2"));
//	  }
	  
    /**
     * Generic Payload Logging Filter.
     * @return CommonsRequestLoggingFilter
     */
//	  @Bean
//	  public CommonsRequestLoggingFilter requestLoggingFilter() {
//	      CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
//	      loggingFilter.setIncludeClientInfo(true);
//	      loggingFilter.setIncludeQueryString(true);
//	      loggingFilter.setIncludePayload(true);
//	      loggingFilter.setMaxPayloadLength(64000);
//	      return loggingFilter;
//	  }

}

package com.maximus.osbtransform.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.maximus.osbtransform.interceptor.VidaTransformationInterceptor;
import com.maximus.osbtransform.interceptor.VidaValidationInterceptor;

@EnableWs
@Configuration
public class InterceptorsConfig extends WsConfigurerAdapter {
	
    @Value("${xslt.request}")
    private String xsltRequestFile;
    
    @Value("${xslt.response}")
    private String xsltResponseFile;
    
    //private static final String SCHEMA_LOCATION = "wsdl/schemas/";
	
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
	  @Bean
	  public CommonsRequestLoggingFilter requestLoggingFilter() {
	      CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
	      loggingFilter.setIncludeClientInfo(true);
	      loggingFilter.setIncludeQueryString(true);
	      loggingFilter.setIncludePayload(true);
	      loggingFilter.setMaxPayloadLength(64000);
	      return loggingFilter;
	  }
    
	  @Bean
	  @Order(1)
	  public SmartEndpointInterceptor insertLetterPDFLinksValidationInterceptor() {
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
					"http://webservice.flhk.com/FLHKWebService/1.0", 
					"insertLetterPDFLinks");
	  }	     
	  
	  @Bean
	  @Order(100)
	  public SmartEndpointInterceptor insertLetterPDFLinksTansformInterceptor() {
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
					"http://webservice.flhk.com/FLHKWebService/1.0", 
					"insertLetterPDFLinks");
	  }
	  
	  @Bean
	  public XsdSchema insertLetterPOFLinksSchema() {
	    return new SimpleXsdSchema(new ClassPathResource("wsdl/schemas/LetterManagerWSSchema.xsd"));
	  }
	  
 
	  
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
	  
}

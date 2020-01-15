package com.soap.ws.xquery.transform.demo;

import java.util.List;

import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

import com.maximus.interceptor.VidaTransformationInterceptor;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
    @Value("${xslt.request}")
    private String xsltRequestFile;
    
    @Value("${xslt.response}")
    private String xsltResponseFile;
		
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet, "/osbws/*");
	}
	
	@Bean(name = "osbletterservice")
	public SimpleWsdl11Definition orders() {
		return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/osblettermanagerws.wsdl"));
	}

	/*
	 * @Bean(name = "osbletterservice") public DefaultWsdl11Definition
	 * defaultWsdl11Definition(XsdSchema transformSchema) { DefaultWsdl11Definition
	 * definition = new DefaultWsdl11Definition();
	 * definition.setPortTypeName("TransformPort");
	 * definition.setTargetNamespace("http://webservice.flhk.com/FLHKWebService/1.0"
	 * ); definition.setLocationUri("/osbws");
	 * definition.setSchema(transformSchema); return definition; }
	 * 
	 * @Bean public XsdSchema transformSchema() { return new SimpleXsdSchema(new
	 * ClassPathResource("LetterManagerWSSchema.xsd")); }
	 */

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.psi.vida.logging.ws.services", "com.psi.vida.services.lettermanagement._1");
		return marshaller;
	}
	
	@Bean 
	Marshaller jaxbMarshaller(Jaxb2Marshaller marshaller) {
		Marshaller mar = marshaller.createMarshaller();
		try {
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		}catch(PropertyException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return mar;
	}
	
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
	  
	  @Bean
	  public SmartEndpointInterceptor addSmartEndpointInterceptor() {
			VidaTransformationInterceptor payloadTransInterceptor = new VidaTransformationInterceptor();
			//PayloadTransformingInterceptor payloadTransInterceptor = new PayloadTransformingInterceptor();
			Resource requestXslt = new ClassPathResource(xsltRequestFile);
			payloadTransInterceptor.setRequestXslt(requestXslt);
			Resource responseXslt = new ClassPathResource(xsltResponseFile);
			payloadTransInterceptor.setResponseXslt(responseXslt);
			try{
				payloadTransInterceptor.afterPropertiesSet();
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}

			return new PayloadRootSmartSoapEndpointInterceptor(payloadTransInterceptor,
					"http://webservice.flhk.com/FLHKWebService/1.0", 
					"insertLetterPDFLinks");
	  }
}

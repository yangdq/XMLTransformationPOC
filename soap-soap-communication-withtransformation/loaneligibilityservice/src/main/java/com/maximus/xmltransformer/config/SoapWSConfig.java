package com.maximus.xmltransformer.config;

import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.maximus.xmltransformer.endpoint.LoanEligibilityindicatorEndpoint;
import com.maximus.xmltransformer.endpoint.SOAPConnector;
import com.maximus.xmltransformer.interceptors.LoanEligibilityInterceptor;

@Configuration
@EnableWs
public class SoapWSConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
	}

	@Bean(name = "PersonDetailsRequest")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName("Accountindicator");
		defaultWsdl11Definition.setLocationUri("/ws");
		defaultWsdl11Definition.setTargetNamespace("http://www.maximus.com/loaneligibility/person");
		defaultWsdl11Definition.setSchema(schema);
		return defaultWsdl11Definition;
	}
	
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.maximus.xmltransformer.loaneligibility"); 
        return marshaller;
    }
 
    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://localhost:9090/customerdetails/sambha");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("ServiceClient.xsd"));
	}
	
	@Override
	public void addInterceptors(List<EndpointInterceptor> interceptors) {
		// register global interceptor
        interceptors.add(new LoanEligibilityInterceptor());

        // register endpoint specific interceptor
        interceptors.add(new PayloadRootSmartSoapEndpointInterceptor(
                new LoanEligibilityInterceptor(),
                LoanEligibilityindicatorEndpoint.UPDATEACCOUNTDATAURL,
                "PersonDetailsRequest"));
	}

}

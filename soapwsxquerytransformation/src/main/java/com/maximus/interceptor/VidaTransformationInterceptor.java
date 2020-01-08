package com.maximus.interceptor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.ResourceSource;
import org.springframework.xml.transform.TransformerObjectSupport;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

@Component
public class VidaTransformationInterceptor extends TransformerObjectSupport
  implements EndpointInterceptor, InitializingBean
{
  private static final Log logger = LogFactory.getLog(VidaTransformationInterceptor.class);
  private Resource requestXslt;
  private Resource responseXslt;
  private Templates requestTemplates;
  private Templates responseTemplates;

  public void setRequestXslt(Resource requestXslt)
  {
    this.requestXslt = requestXslt;
  }

  public void setResponseXslt(Resource responseXslt)
  {
    this.responseXslt = responseXslt;
  }
  
//  @Override
//  public boolean shouldIntercept(MessageContext messageContext, Object endpoint) {
//	  if(endpoint instanceof OsbEndpoint) {
//		  return false;
//	  }
//	  else{
//		  return true;
//	  }
//  }

  public boolean handleRequest(MessageContext messageContext, Object endpoint)
    throws Exception
  {
	System.out.println("########################VidaTransformationInterceptor handleRequest#################");
	SoapMessage message = (SoapMessage) messageContext.getRequest();
	System.out.println("originalMessage = [");
	message.writeTo(System.out);
		
    if (this.requestTemplates != null) {
      WebServiceMessage request = messageContext.getRequest();
      Transformer transformer = this.requestTemplates.newTransformer();
      transformMessage(request, transformer);
      logger.debug("Request message transformed");
    }
    
	message = (SoapMessage) messageContext.getRequest();
	System.out.println("transformedMessage = [" );
	message.writeTo(System.out);
	
    return true;
  }
  

  public boolean handleResponse(MessageContext messageContext, Object endpoint)
    throws Exception
  {
    if (this.responseTemplates != null) {
      WebServiceMessage response = messageContext.getResponse();
      Transformer transformer = this.responseTemplates.newTransformer();
      transformMessage(response, transformer);
      logger.debug("Response message transformed");
    }
    return true;
  }
  
 

  private void transformMessage(WebServiceMessage message, Transformer transformer) throws TransformerException {
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    transformer.transform(message.getPayloadSource(), new StreamResult(os));
    ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
    transform(new StreamSource(is), message.getPayloadResult());
  }

  public boolean handleFault(MessageContext messageContext, Object endpoint)
    throws Exception
  {
    return true;
  }

  public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex)
  {
  }

  public void afterPropertiesSet()
    throws Exception
  {
    if ((this.requestXslt == null) && (this.responseXslt == null)) {
      throw new IllegalArgumentException("Setting either 'requestXslt' or 'responseXslt' is required");
    }
    TransformerFactory transformerFactory = getTransformerFactory();
    XMLReader xmlReader = XMLReaderFactory.createXMLReader();
    xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
    if (this.requestXslt != null) {
      Assert.isTrue(this.requestXslt.exists(), "requestXslt \"" + this.requestXslt + "\" does not exit");
      if (logger.isInfoEnabled()) {
        logger.info("Transforming request using " + this.requestXslt);
      }
      Source requestSource = new ResourceSource(xmlReader, this.requestXslt);
      this.requestTemplates = transformerFactory.newTemplates(requestSource);
    }
    if (this.responseXslt != null) {
      Assert.isTrue(this.responseXslt.exists(), "responseXslt \"" + this.responseXslt + "\" does not exit");
      if (logger.isInfoEnabled()) {
        logger.info("Transforming response using " + this.responseXslt);
      }
      Source responseSource = new ResourceSource(xmlReader, this.responseXslt);
      this.responseTemplates = transformerFactory.newTemplates(responseSource);
    }
  }
}


	

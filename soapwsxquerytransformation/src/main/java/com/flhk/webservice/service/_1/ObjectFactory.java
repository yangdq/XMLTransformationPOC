//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:57 PM CST 
//


package com.flhk.webservice.service._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flhk.webservice.service._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceReply_QNAME = new QName("http://webservice.flhk.com/Service/1.0", "serviceReply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flhk.webservice.service._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceReply }
     * 
     */
    public ServiceReply createServiceReply() {
        return new ServiceReply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.flhk.com/Service/1.0", name = "serviceReply")
    public JAXBElement<ServiceReply> createServiceReply(ServiceReply value) {
        return new JAXBElement<ServiceReply>(_ServiceReply_QNAME, ServiceReply.class, null, value);
    }

}

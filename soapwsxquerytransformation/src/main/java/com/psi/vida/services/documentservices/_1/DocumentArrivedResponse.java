//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:56 PM CST 
//


package com.psi.vida.services.documentservices._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentArrivedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentArrivedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceReply" type="{http://services.vida.psi.com/DocumentServices/1.0}inboundDocumentServiceReply" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentArrivedResponse", propOrder = {
    "serviceReply"
})
@XmlRootElement(name = "documentArrivedResponse")
public class DocumentArrivedResponse {

    protected InboundDocumentServiceReply serviceReply;

    /**
     * Gets the value of the serviceReply property.
     * 
     * @return
     *     possible object is
     *     {@link InboundDocumentServiceReply }
     *     
     */
    public InboundDocumentServiceReply getServiceReply() {
        return serviceReply;
    }

    /**
     * Sets the value of the serviceReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundDocumentServiceReply }
     *     
     */
    public void setServiceReply(InboundDocumentServiceReply value) {
        this.serviceReply = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamingException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamingException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainingName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="resolvedName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="resolvedObj" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="rootCause" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamingException", propOrder = {
    "explanation",
    "message",
    "remainingName",
    "resolvedName",
    "resolvedObj",
    "rootCause"
})
public class NamingException {

    protected String explanation;
    protected String message;
    @XmlSchemaType(name = "anySimpleType")
    protected Object remainingName;
    @XmlSchemaType(name = "anySimpleType")
    protected Object resolvedName;
    protected Object resolvedObj;
    @XmlSchemaType(name = "anySimpleType")
    protected Object rootCause;

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the remainingName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRemainingName() {
        return remainingName;
    }

    /**
     * Sets the value of the remainingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRemainingName(Object value) {
        this.remainingName = value;
    }

    /**
     * Gets the value of the resolvedName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolvedName() {
        return resolvedName;
    }

    /**
     * Sets the value of the resolvedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolvedName(Object value) {
        this.resolvedName = value;
    }

    /**
     * Gets the value of the resolvedObj property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResolvedObj() {
        return resolvedObj;
    }

    /**
     * Sets the value of the resolvedObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResolvedObj(Object value) {
        this.resolvedObj = value;
    }

    /**
     * Gets the value of the rootCause property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRootCause() {
        return rootCause;
    }

    /**
     * Sets the value of the rootCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRootCause(Object value) {
        this.rootCause = value;
    }

}

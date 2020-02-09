//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for immigrationFactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="immigrationFactors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivedBefore1996" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibleImmigrationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="immigrantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="immigrationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="immigrationDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "immigrationFactors", propOrder = {
    "arrivedBefore1996",
    "eligibleImmigrationStatus",
    "immigrantCode",
    "immigrationDocumentNumber",
    "immigrationDocumentType"
})
public class ImmigrationFactors {

    protected Boolean arrivedBefore1996;
    protected Boolean eligibleImmigrationStatus;
    protected String immigrantCode;
    protected String immigrationDocumentNumber;
    protected String immigrationDocumentType;

    /**
     * Gets the value of the arrivedBefore1996 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrivedBefore1996() {
        return arrivedBefore1996;
    }

    /**
     * Sets the value of the arrivedBefore1996 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrivedBefore1996(Boolean value) {
        this.arrivedBefore1996 = value;
    }

    /**
     * Gets the value of the eligibleImmigrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleImmigrationStatus() {
        return eligibleImmigrationStatus;
    }

    /**
     * Sets the value of the eligibleImmigrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleImmigrationStatus(Boolean value) {
        this.eligibleImmigrationStatus = value;
    }

    /**
     * Gets the value of the immigrantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrantCode() {
        return immigrantCode;
    }

    /**
     * Sets the value of the immigrantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrantCode(String value) {
        this.immigrantCode = value;
    }

    /**
     * Gets the value of the immigrationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrationDocumentNumber() {
        return immigrationDocumentNumber;
    }

    /**
     * Sets the value of the immigrationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrationDocumentNumber(String value) {
        this.immigrationDocumentNumber = value;
    }

    /**
     * Gets the value of the immigrationDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrationDocumentType() {
        return immigrationDocumentType;
    }

    /**
     * Sets the value of the immigrationDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrationDocumentType(String value) {
        this.immigrationDocumentType = value;
    }

}

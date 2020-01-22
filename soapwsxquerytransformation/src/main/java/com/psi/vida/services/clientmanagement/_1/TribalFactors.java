//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.22 at 11:47:16 AM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tribalFactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tribalFactors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="americanIndianOrAlaskanNative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibleForITUServices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="receivedITUServices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recognizedTribe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tribalMembershipVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tribalMembershipVerifiedByAtoMetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tribalMembershipVerifiedDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="tribeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tribalFactors", propOrder = {
    "americanIndianOrAlaskanNative",
    "eligibleForITUServices",
    "receivedITUServices",
    "recognizedTribe",
    "tribalMembershipVerified",
    "tribalMembershipVerifiedByAtoMetadataId",
    "tribalMembershipVerifiedDate",
    "tribeName"
})
public class TribalFactors {

    protected Boolean americanIndianOrAlaskanNative;
    protected Boolean eligibleForITUServices;
    protected Boolean receivedITUServices;
    protected Boolean recognizedTribe;
    protected boolean tribalMembershipVerified;
    protected String tribalMembershipVerifiedByAtoMetadataId;
    protected CalendarDay tribalMembershipVerifiedDate;
    protected String tribeName;

    /**
     * Gets the value of the americanIndianOrAlaskanNative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmericanIndianOrAlaskanNative() {
        return americanIndianOrAlaskanNative;
    }

    /**
     * Sets the value of the americanIndianOrAlaskanNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmericanIndianOrAlaskanNative(Boolean value) {
        this.americanIndianOrAlaskanNative = value;
    }

    /**
     * Gets the value of the eligibleForITUServices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForITUServices() {
        return eligibleForITUServices;
    }

    /**
     * Sets the value of the eligibleForITUServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForITUServices(Boolean value) {
        this.eligibleForITUServices = value;
    }

    /**
     * Gets the value of the receivedITUServices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivedITUServices() {
        return receivedITUServices;
    }

    /**
     * Sets the value of the receivedITUServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivedITUServices(Boolean value) {
        this.receivedITUServices = value;
    }

    /**
     * Gets the value of the recognizedTribe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecognizedTribe() {
        return recognizedTribe;
    }

    /**
     * Sets the value of the recognizedTribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecognizedTribe(Boolean value) {
        this.recognizedTribe = value;
    }

    /**
     * Gets the value of the tribalMembershipVerified property.
     * 
     */
    public boolean isTribalMembershipVerified() {
        return tribalMembershipVerified;
    }

    /**
     * Sets the value of the tribalMembershipVerified property.
     * 
     */
    public void setTribalMembershipVerified(boolean value) {
        this.tribalMembershipVerified = value;
    }

    /**
     * Gets the value of the tribalMembershipVerifiedByAtoMetadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTribalMembershipVerifiedByAtoMetadataId() {
        return tribalMembershipVerifiedByAtoMetadataId;
    }

    /**
     * Sets the value of the tribalMembershipVerifiedByAtoMetadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTribalMembershipVerifiedByAtoMetadataId(String value) {
        this.tribalMembershipVerifiedByAtoMetadataId = value;
    }

    /**
     * Gets the value of the tribalMembershipVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getTribalMembershipVerifiedDate() {
        return tribalMembershipVerifiedDate;
    }

    /**
     * Sets the value of the tribalMembershipVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setTribalMembershipVerifiedDate(CalendarDay value) {
        this.tribalMembershipVerifiedDate = value;
    }

    /**
     * Gets the value of the tribeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTribeName() {
        return tribeName;
    }

    /**
     * Sets the value of the tribeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTribeName(String value) {
        this.tribeName = value;
    }

}

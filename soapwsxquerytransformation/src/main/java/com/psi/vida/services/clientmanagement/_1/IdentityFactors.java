//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identityFactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identityFactors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fiveYearStatus" type="{http://services.vida.psi.com/ClientManagement/1.0}fiveYearBarStatus" minOccurs="0"/&gt;
 *         &lt;element name="identityVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="identityVerifiedByAtoMetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityVerifiedDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityFactors", propOrder = {
    "fiveYearStatus",
    "identityVerified",
    "identityVerifiedByAtoMetadataId",
    "identityVerifiedDate"
})
public class IdentityFactors {

    @XmlSchemaType(name = "string")
    protected FiveYearBarStatus fiveYearStatus;
    protected boolean identityVerified;
    protected String identityVerifiedByAtoMetadataId;
    protected CalendarDay identityVerifiedDate;

    /**
     * Gets the value of the fiveYearStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FiveYearBarStatus }
     *     
     */
    public FiveYearBarStatus getFiveYearStatus() {
        return fiveYearStatus;
    }

    /**
     * Sets the value of the fiveYearStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiveYearBarStatus }
     *     
     */
    public void setFiveYearStatus(FiveYearBarStatus value) {
        this.fiveYearStatus = value;
    }

    /**
     * Gets the value of the identityVerified property.
     * 
     */
    public boolean isIdentityVerified() {
        return identityVerified;
    }

    /**
     * Sets the value of the identityVerified property.
     * 
     */
    public void setIdentityVerified(boolean value) {
        this.identityVerified = value;
    }

    /**
     * Gets the value of the identityVerifiedByAtoMetadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityVerifiedByAtoMetadataId() {
        return identityVerifiedByAtoMetadataId;
    }

    /**
     * Sets the value of the identityVerifiedByAtoMetadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityVerifiedByAtoMetadataId(String value) {
        this.identityVerifiedByAtoMetadataId = value;
    }

    /**
     * Gets the value of the identityVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getIdentityVerifiedDate() {
        return identityVerifiedDate;
    }

    /**
     * Sets the value of the identityVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setIdentityVerifiedDate(CalendarDay value) {
        this.identityVerifiedDate = value;
    }

}

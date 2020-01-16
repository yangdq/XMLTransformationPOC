//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:54 PM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenshipFactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenshipFactors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citizenshipVerifiedByAtoMetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizenshipVerifiedDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="citizenshipVerifiedType" type="{http://services.vida.psi.com/ServiceClient/1.0}citizenshipTypeEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenshipFactors", propOrder = {
    "citizenshipVerifiedByAtoMetadataId",
    "citizenshipVerifiedDate",
    "citizenshipVerifiedType"
})
public class CitizenshipFactors {

    protected String citizenshipVerifiedByAtoMetadataId;
    protected CalendarDay citizenshipVerifiedDate;
    @XmlSchemaType(name = "string")
    protected CitizenshipTypeEnum citizenshipVerifiedType;

    /**
     * Gets the value of the citizenshipVerifiedByAtoMetadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipVerifiedByAtoMetadataId() {
        return citizenshipVerifiedByAtoMetadataId;
    }

    /**
     * Sets the value of the citizenshipVerifiedByAtoMetadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipVerifiedByAtoMetadataId(String value) {
        this.citizenshipVerifiedByAtoMetadataId = value;
    }

    /**
     * Gets the value of the citizenshipVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getCitizenshipVerifiedDate() {
        return citizenshipVerifiedDate;
    }

    /**
     * Sets the value of the citizenshipVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setCitizenshipVerifiedDate(CalendarDay value) {
        this.citizenshipVerifiedDate = value;
    }

    /**
     * Gets the value of the citizenshipVerifiedType property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenshipTypeEnum }
     *     
     */
    public CitizenshipTypeEnum getCitizenshipVerifiedType() {
        return citizenshipVerifiedType;
    }

    /**
     * Sets the value of the citizenshipVerifiedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenshipTypeEnum }
     *     
     */
    public void setCitizenshipVerifiedType(CitizenshipTypeEnum value) {
        this.citizenshipVerifiedType = value;
    }

}

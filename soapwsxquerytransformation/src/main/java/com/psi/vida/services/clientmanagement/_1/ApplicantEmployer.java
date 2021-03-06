//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicantEmployer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicantEmployer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://services.vida.psi.com/ClientManagement/1.0}unvalidatedAddress" minOccurs="0"/&gt;
 *         &lt;element name="applicantEmployerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="atoRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esiCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="esiEligibilityDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="esiEndDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="esiExpectedChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="esiExpectedChangeDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="esiExpectedDrop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="esiFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esiMeetsMinimumStandard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="esiNewCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="esiNewFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="esiOffered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicantEmployer", propOrder = {
    "address",
    "applicantEmployerId",
    "atoRefId",
    "ein",
    "employerName",
    "esiCost",
    "esiEligibilityDate",
    "esiEndDate",
    "esiExpectedChange",
    "esiExpectedChangeDate",
    "esiExpectedDrop",
    "esiFrequency",
    "esiMeetsMinimumStandard",
    "esiNewCost",
    "esiNewFrequency",
    "esiOffered"
})
public class ApplicantEmployer {

    protected UnvalidatedAddress address;
    protected Long applicantEmployerId;
    protected String atoRefId;
    protected String ein;
    protected String employerName;
    protected BigDecimal esiCost;
    protected CalendarDay esiEligibilityDate;
    protected CalendarDay esiEndDate;
    protected Boolean esiExpectedChange;
    protected CalendarDay esiExpectedChangeDate;
    protected Boolean esiExpectedDrop;
    protected String esiFrequency;
    protected Boolean esiMeetsMinimumStandard;
    protected BigDecimal esiNewCost;
    protected String esiNewFrequency;
    protected Boolean esiOffered;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public UnvalidatedAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public void setAddress(UnvalidatedAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the applicantEmployerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicantEmployerId() {
        return applicantEmployerId;
    }

    /**
     * Sets the value of the applicantEmployerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicantEmployerId(Long value) {
        this.applicantEmployerId = value;
    }

    /**
     * Gets the value of the atoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtoRefId() {
        return atoRefId;
    }

    /**
     * Sets the value of the atoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtoRefId(String value) {
        this.atoRefId = value;
    }

    /**
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEin() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEin(String value) {
        this.ein = value;
    }

    /**
     * Gets the value of the employerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the value of the employerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Gets the value of the esiCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEsiCost() {
        return esiCost;
    }

    /**
     * Sets the value of the esiCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEsiCost(BigDecimal value) {
        this.esiCost = value;
    }

    /**
     * Gets the value of the esiEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getEsiEligibilityDate() {
        return esiEligibilityDate;
    }

    /**
     * Sets the value of the esiEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setEsiEligibilityDate(CalendarDay value) {
        this.esiEligibilityDate = value;
    }

    /**
     * Gets the value of the esiEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getEsiEndDate() {
        return esiEndDate;
    }

    /**
     * Sets the value of the esiEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setEsiEndDate(CalendarDay value) {
        this.esiEndDate = value;
    }

    /**
     * Gets the value of the esiExpectedChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsiExpectedChange() {
        return esiExpectedChange;
    }

    /**
     * Sets the value of the esiExpectedChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsiExpectedChange(Boolean value) {
        this.esiExpectedChange = value;
    }

    /**
     * Gets the value of the esiExpectedChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getEsiExpectedChangeDate() {
        return esiExpectedChangeDate;
    }

    /**
     * Sets the value of the esiExpectedChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setEsiExpectedChangeDate(CalendarDay value) {
        this.esiExpectedChangeDate = value;
    }

    /**
     * Gets the value of the esiExpectedDrop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsiExpectedDrop() {
        return esiExpectedDrop;
    }

    /**
     * Sets the value of the esiExpectedDrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsiExpectedDrop(Boolean value) {
        this.esiExpectedDrop = value;
    }

    /**
     * Gets the value of the esiFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsiFrequency() {
        return esiFrequency;
    }

    /**
     * Sets the value of the esiFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsiFrequency(String value) {
        this.esiFrequency = value;
    }

    /**
     * Gets the value of the esiMeetsMinimumStandard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsiMeetsMinimumStandard() {
        return esiMeetsMinimumStandard;
    }

    /**
     * Sets the value of the esiMeetsMinimumStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsiMeetsMinimumStandard(Boolean value) {
        this.esiMeetsMinimumStandard = value;
    }

    /**
     * Gets the value of the esiNewCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEsiNewCost() {
        return esiNewCost;
    }

    /**
     * Sets the value of the esiNewCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEsiNewCost(BigDecimal value) {
        this.esiNewCost = value;
    }

    /**
     * Gets the value of the esiNewFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsiNewFrequency() {
        return esiNewFrequency;
    }

    /**
     * Sets the value of the esiNewFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsiNewFrequency(String value) {
        this.esiNewFrequency = value;
    }

    /**
     * Gets the value of the esiOffered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsiOffered() {
        return esiOffered;
    }

    /**
     * Sets the value of the esiOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsiOffered(Boolean value) {
        this.esiOffered = value;
    }

}

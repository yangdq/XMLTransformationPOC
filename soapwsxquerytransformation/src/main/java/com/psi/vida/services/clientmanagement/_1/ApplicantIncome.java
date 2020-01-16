//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicantIncome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicantIncome"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://services.vida.psi.com/ClientManagement/1.0}incomeTypeEnum"/&gt;
 *         &lt;element name="appFinanceItemStatus" type="{http://services.vida.psi.com/ClientManagement/1.0}applicantFinanceItemStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="applicantEmployerAtoRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicantIncomeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://services.vida.psi.com/ClientManagement/1.0}monetaryFlowFrequency" minOccurs="0"/&gt;
 *         &lt;element name="hoursWorkedPerWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="incomeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="otherTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="selfEmploymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="verifiedByAtoMetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifiedDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicantIncome", propOrder = {
    "type",
    "appFinanceItemStatus",
    "applicantEmployerAtoRefId",
    "applicantIncomeId",
    "frequency",
    "hoursWorkedPerWeek",
    "incomeNumber",
    "otherTypeDescription",
    "reportedMonthlyAmount",
    "selfEmploymentDescription",
    "verified",
    "verifiedByAtoMetadataId",
    "verifiedDate"
})
public class ApplicantIncome {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IncomeTypeEnum type;
    @XmlSchemaType(name = "string")
    protected ApplicantFinanceItemStatusEnum appFinanceItemStatus;
    protected String applicantEmployerAtoRefId;
    protected Long applicantIncomeId;
    @XmlSchemaType(name = "string")
    protected MonetaryFlowFrequency frequency;
    protected Integer hoursWorkedPerWeek;
    protected Long incomeNumber;
    protected String otherTypeDescription;
    protected BigDecimal reportedMonthlyAmount;
    protected String selfEmploymentDescription;
    protected Boolean verified;
    protected String verifiedByAtoMetadataId;
    protected CalendarDay verifiedDate;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeTypeEnum }
     *     
     */
    public IncomeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeTypeEnum }
     *     
     */
    public void setType(IncomeTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the appFinanceItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantFinanceItemStatusEnum }
     *     
     */
    public ApplicantFinanceItemStatusEnum getAppFinanceItemStatus() {
        return appFinanceItemStatus;
    }

    /**
     * Sets the value of the appFinanceItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantFinanceItemStatusEnum }
     *     
     */
    public void setAppFinanceItemStatus(ApplicantFinanceItemStatusEnum value) {
        this.appFinanceItemStatus = value;
    }

    /**
     * Gets the value of the applicantEmployerAtoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantEmployerAtoRefId() {
        return applicantEmployerAtoRefId;
    }

    /**
     * Sets the value of the applicantEmployerAtoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantEmployerAtoRefId(String value) {
        this.applicantEmployerAtoRefId = value;
    }

    /**
     * Gets the value of the applicantIncomeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicantIncomeId() {
        return applicantIncomeId;
    }

    /**
     * Sets the value of the applicantIncomeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicantIncomeId(Long value) {
        this.applicantIncomeId = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryFlowFrequency }
     *     
     */
    public MonetaryFlowFrequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryFlowFrequency }
     *     
     */
    public void setFrequency(MonetaryFlowFrequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the hoursWorkedPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    /**
     * Sets the value of the hoursWorkedPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursWorkedPerWeek(Integer value) {
        this.hoursWorkedPerWeek = value;
    }

    /**
     * Gets the value of the incomeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomeNumber() {
        return incomeNumber;
    }

    /**
     * Sets the value of the incomeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomeNumber(Long value) {
        this.incomeNumber = value;
    }

    /**
     * Gets the value of the otherTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTypeDescription() {
        return otherTypeDescription;
    }

    /**
     * Sets the value of the otherTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTypeDescription(String value) {
        this.otherTypeDescription = value;
    }

    /**
     * Gets the value of the reportedMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReportedMonthlyAmount() {
        return reportedMonthlyAmount;
    }

    /**
     * Sets the value of the reportedMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReportedMonthlyAmount(BigDecimal value) {
        this.reportedMonthlyAmount = value;
    }

    /**
     * Gets the value of the selfEmploymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfEmploymentDescription() {
        return selfEmploymentDescription;
    }

    /**
     * Sets the value of the selfEmploymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfEmploymentDescription(String value) {
        this.selfEmploymentDescription = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerified(Boolean value) {
        this.verified = value;
    }

    /**
     * Gets the value of the verifiedByAtoMetadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedByAtoMetadataId() {
        return verifiedByAtoMetadataId;
    }

    /**
     * Sets the value of the verifiedByAtoMetadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedByAtoMetadataId(String value) {
        this.verifiedByAtoMetadataId = value;
    }

    /**
     * Gets the value of the verifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getVerifiedDate() {
        return verifiedDate;
    }

    /**
     * Sets the value of the verifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setVerifiedDate(CalendarDay value) {
        this.verifiedDate = value;
    }

}

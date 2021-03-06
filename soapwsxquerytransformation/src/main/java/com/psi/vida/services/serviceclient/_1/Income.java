//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:54 PM CST 
//


package com.psi.vida.services.serviceclient._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for income complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="income"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityStatus" type="{http://services.vida.psi.com/ServiceClient/1.0}entityStatusEnum"/&gt;
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://services.vida.psi.com/ServiceClient/1.0}monetaryFlowFrequency" minOccurs="0"/&gt;
 *         &lt;element name="hoursWorkedPerWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="incomeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="incomeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="otherTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reportedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="selfEmploymentDocDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://services.vida.psi.com/ServiceClient/1.0}incomeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="verifiedEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifiedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "income", propOrder = {
    "entityStatus",
    "activeFlag",
    "documentId",
    "employerName",
    "frequency",
    "hoursWorkedPerWeek",
    "incomeId",
    "incomeNumber",
    "jpaVersion",
    "otherTypeDescription",
    "reportedMonthlyAmount",
    "selfEmploymentDocDate",
    "type",
    "verifiedEmployerName",
    "verifiedMonthlyAmount"
})
public class Income {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EntityStatusEnum entityStatus;
    protected boolean activeFlag;
    protected Long documentId;
    protected String employerName;
    @XmlSchemaType(name = "string")
    protected MonetaryFlowFrequency frequency;
    protected Integer hoursWorkedPerWeek;
    protected Long incomeId;
    protected Long incomeNumber;
    protected Long jpaVersion;
    protected String otherTypeDescription;
    protected BigDecimal reportedMonthlyAmount;
    protected CalendarDay selfEmploymentDocDate;
    @XmlSchemaType(name = "string")
    protected IncomeTypeEnum type;
    protected String verifiedEmployerName;
    protected BigDecimal verifiedMonthlyAmount;

    /**
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatusEnum }
     *     
     */
    public EntityStatusEnum getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatusEnum }
     *     
     */
    public void setEntityStatus(EntityStatusEnum value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     */
    public boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     */
    public void setActiveFlag(boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
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
     * Gets the value of the incomeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomeId() {
        return incomeId;
    }

    /**
     * Sets the value of the incomeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomeId(Long value) {
        this.incomeId = value;
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
     * Gets the value of the jpaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJpaVersion() {
        return jpaVersion;
    }

    /**
     * Sets the value of the jpaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJpaVersion(Long value) {
        this.jpaVersion = value;
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
     * Gets the value of the selfEmploymentDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getSelfEmploymentDocDate() {
        return selfEmploymentDocDate;
    }

    /**
     * Sets the value of the selfEmploymentDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setSelfEmploymentDocDate(CalendarDay value) {
        this.selfEmploymentDocDate = value;
    }

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
     * Gets the value of the verifiedEmployerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedEmployerName() {
        return verifiedEmployerName;
    }

    /**
     * Sets the value of the verifiedEmployerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedEmployerName(String value) {
        this.verifiedEmployerName = value;
    }

    /**
     * Gets the value of the verifiedMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVerifiedMonthlyAmount() {
        return verifiedMonthlyAmount;
    }

    /**
     * Sets the value of the verifiedMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVerifiedMonthlyAmount(BigDecimal value) {
        this.verifiedMonthlyAmount = value;
    }

}

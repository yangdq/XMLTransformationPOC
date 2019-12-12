//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityStatus" type="{http://services.vida.psi.com/ServiceClient/1.0}entityStatusEnum"/>
 *         &lt;element name="activeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expenseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="expenseNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://services.vida.psi.com/ServiceClient/1.0}monetaryFlowFrequency" minOccurs="0"/>
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nameOfCaredForPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherDeductionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherPayor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reportedMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="type" type="{http://services.vida.psi.com/ServiceClient/1.0}expenseTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expense", propOrder = {
    "entityStatus",
    "activeFlag",
    "disabled",
    "expenseId",
    "expenseNumber",
    "frequency",
    "jpaVersion",
    "nameOfCaredForPerson",
    "otherDeductionName",
    "otherPayor",
    "reportedMonthlyAmount",
    "type"
})
public class Expense {

    @XmlElement(required = true)
    protected EntityStatusEnum entityStatus;
    protected boolean activeFlag;
    protected boolean disabled;
    protected Long expenseId;
    protected Long expenseNumber;
    protected MonetaryFlowFrequency frequency;
    protected Long jpaVersion;
    protected String nameOfCaredForPerson;
    protected String otherDeductionName;
    protected boolean otherPayor;
    protected BigDecimal reportedMonthlyAmount;
    protected ExpenseTypeEnum type;

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
     * Gets the value of the disabled property.
     * 
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the expenseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpenseId() {
        return expenseId;
    }

    /**
     * Sets the value of the expenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpenseId(Long value) {
        this.expenseId = value;
    }

    /**
     * Gets the value of the expenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpenseNumber() {
        return expenseNumber;
    }

    /**
     * Sets the value of the expenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpenseNumber(Long value) {
        this.expenseNumber = value;
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
     * Gets the value of the nameOfCaredForPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfCaredForPerson() {
        return nameOfCaredForPerson;
    }

    /**
     * Sets the value of the nameOfCaredForPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfCaredForPerson(String value) {
        this.nameOfCaredForPerson = value;
    }

    /**
     * Gets the value of the otherDeductionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDeductionName() {
        return otherDeductionName;
    }

    /**
     * Sets the value of the otherDeductionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDeductionName(String value) {
        this.otherDeductionName = value;
    }

    /**
     * Gets the value of the otherPayor property.
     * 
     */
    public boolean isOtherPayor() {
        return otherPayor;
    }

    /**
     * Sets the value of the otherPayor property.
     * 
     */
    public void setOtherPayor(boolean value) {
        this.otherPayor = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseTypeEnum }
     *     
     */
    public ExpenseTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseTypeEnum }
     *     
     */
    public void setType(ExpenseTypeEnum value) {
        this.type = value;
    }

}
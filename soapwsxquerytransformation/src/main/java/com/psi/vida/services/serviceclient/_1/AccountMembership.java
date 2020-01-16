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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountMembership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountMembershipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="accountMembershipNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="applicationSignedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="applyingForBenefitsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="claimedByAccountMembershipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cmsOptOutFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="enrollmentStatusEnum" type="{http://services.vida.psi.com/ServiceClient/1.0}enrollmentStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="ffmReferralOverrideDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="insuranceProviderTO" type="{http://services.vida.psi.com/ServiceClient/1.0}insuranceProvider" minOccurs="0"/&gt;
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="medicaidEligibilityStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="medicaidMatchOverrideDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="medicaidReferralOverrideDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="movedFromAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="movedToAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="optInFullPayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="parentType" type="{http://services.vida.psi.com/ServiceClient/1.0}parentTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="person" type="{http://services.vida.psi.com/ServiceClient/1.0}person" minOccurs="0"/&gt;
 *         &lt;element name="primaryTaxFilerIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="spouseTaxFilerAccountMembershipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountMembership", propOrder = {
    "accountMembershipId",
    "accountMembershipNumber",
    "applicationSignedFlag",
    "applyingForBenefitsIndicator",
    "claimedByAccountMembershipId",
    "cmsOptOutFlag",
    "enrollmentStatusEnum",
    "ffmReferralOverrideDate",
    "insuranceProviderTO",
    "jpaVersion",
    "medicaidEligibilityStatusDate",
    "medicaidMatchOverrideDate",
    "medicaidReferralOverrideDate",
    "movedFromAccountNumber",
    "movedToAccountNumber",
    "optInFullPayFlag",
    "parentType",
    "person",
    "primaryTaxFilerIndicator",
    "spouseTaxFilerAccountMembershipId",
    "statusDate"
})
public class AccountMembership {

    protected Long accountMembershipId;
    protected Long accountMembershipNumber;
    protected boolean applicationSignedFlag;
    protected Boolean applyingForBenefitsIndicator;
    protected Long claimedByAccountMembershipId;
    protected boolean cmsOptOutFlag;
    @XmlSchemaType(name = "string")
    protected EnrollmentStatusEnum enrollmentStatusEnum;
    protected CalendarDay ffmReferralOverrideDate;
    protected InsuranceProvider insuranceProviderTO;
    protected Long jpaVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar medicaidEligibilityStatusDate;
    protected CalendarDay medicaidMatchOverrideDate;
    protected CalendarDay medicaidReferralOverrideDate;
    protected Long movedFromAccountNumber;
    protected Long movedToAccountNumber;
    protected boolean optInFullPayFlag;
    @XmlSchemaType(name = "string")
    protected ParentTypeEnum parentType;
    protected Person person;
    protected Boolean primaryTaxFilerIndicator;
    protected Long spouseTaxFilerAccountMembershipId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;

    /**
     * Gets the value of the accountMembershipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountMembershipId() {
        return accountMembershipId;
    }

    /**
     * Sets the value of the accountMembershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountMembershipId(Long value) {
        this.accountMembershipId = value;
    }

    /**
     * Gets the value of the accountMembershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountMembershipNumber() {
        return accountMembershipNumber;
    }

    /**
     * Sets the value of the accountMembershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountMembershipNumber(Long value) {
        this.accountMembershipNumber = value;
    }

    /**
     * Gets the value of the applicationSignedFlag property.
     * 
     */
    public boolean isApplicationSignedFlag() {
        return applicationSignedFlag;
    }

    /**
     * Sets the value of the applicationSignedFlag property.
     * 
     */
    public void setApplicationSignedFlag(boolean value) {
        this.applicationSignedFlag = value;
    }

    /**
     * Gets the value of the applyingForBenefitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyingForBenefitsIndicator() {
        return applyingForBenefitsIndicator;
    }

    /**
     * Sets the value of the applyingForBenefitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyingForBenefitsIndicator(Boolean value) {
        this.applyingForBenefitsIndicator = value;
    }

    /**
     * Gets the value of the claimedByAccountMembershipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClaimedByAccountMembershipId() {
        return claimedByAccountMembershipId;
    }

    /**
     * Sets the value of the claimedByAccountMembershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClaimedByAccountMembershipId(Long value) {
        this.claimedByAccountMembershipId = value;
    }

    /**
     * Gets the value of the cmsOptOutFlag property.
     * 
     */
    public boolean isCmsOptOutFlag() {
        return cmsOptOutFlag;
    }

    /**
     * Sets the value of the cmsOptOutFlag property.
     * 
     */
    public void setCmsOptOutFlag(boolean value) {
        this.cmsOptOutFlag = value;
    }

    /**
     * Gets the value of the enrollmentStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentStatusEnum }
     *     
     */
    public EnrollmentStatusEnum getEnrollmentStatusEnum() {
        return enrollmentStatusEnum;
    }

    /**
     * Sets the value of the enrollmentStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentStatusEnum }
     *     
     */
    public void setEnrollmentStatusEnum(EnrollmentStatusEnum value) {
        this.enrollmentStatusEnum = value;
    }

    /**
     * Gets the value of the ffmReferralOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getFfmReferralOverrideDate() {
        return ffmReferralOverrideDate;
    }

    /**
     * Sets the value of the ffmReferralOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setFfmReferralOverrideDate(CalendarDay value) {
        this.ffmReferralOverrideDate = value;
    }

    /**
     * Gets the value of the insuranceProviderTO property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceProvider }
     *     
     */
    public InsuranceProvider getInsuranceProviderTO() {
        return insuranceProviderTO;
    }

    /**
     * Sets the value of the insuranceProviderTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceProvider }
     *     
     */
    public void setInsuranceProviderTO(InsuranceProvider value) {
        this.insuranceProviderTO = value;
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
     * Gets the value of the medicaidEligibilityStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMedicaidEligibilityStatusDate() {
        return medicaidEligibilityStatusDate;
    }

    /**
     * Sets the value of the medicaidEligibilityStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMedicaidEligibilityStatusDate(XMLGregorianCalendar value) {
        this.medicaidEligibilityStatusDate = value;
    }

    /**
     * Gets the value of the medicaidMatchOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getMedicaidMatchOverrideDate() {
        return medicaidMatchOverrideDate;
    }

    /**
     * Sets the value of the medicaidMatchOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setMedicaidMatchOverrideDate(CalendarDay value) {
        this.medicaidMatchOverrideDate = value;
    }

    /**
     * Gets the value of the medicaidReferralOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getMedicaidReferralOverrideDate() {
        return medicaidReferralOverrideDate;
    }

    /**
     * Sets the value of the medicaidReferralOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setMedicaidReferralOverrideDate(CalendarDay value) {
        this.medicaidReferralOverrideDate = value;
    }

    /**
     * Gets the value of the movedFromAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMovedFromAccountNumber() {
        return movedFromAccountNumber;
    }

    /**
     * Sets the value of the movedFromAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMovedFromAccountNumber(Long value) {
        this.movedFromAccountNumber = value;
    }

    /**
     * Gets the value of the movedToAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMovedToAccountNumber() {
        return movedToAccountNumber;
    }

    /**
     * Sets the value of the movedToAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMovedToAccountNumber(Long value) {
        this.movedToAccountNumber = value;
    }

    /**
     * Gets the value of the optInFullPayFlag property.
     * 
     */
    public boolean isOptInFullPayFlag() {
        return optInFullPayFlag;
    }

    /**
     * Sets the value of the optInFullPayFlag property.
     * 
     */
    public void setOptInFullPayFlag(boolean value) {
        this.optInFullPayFlag = value;
    }

    /**
     * Gets the value of the parentType property.
     * 
     * @return
     *     possible object is
     *     {@link ParentTypeEnum }
     *     
     */
    public ParentTypeEnum getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentTypeEnum }
     *     
     */
    public void setParentType(ParentTypeEnum value) {
        this.parentType = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the primaryTaxFilerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryTaxFilerIndicator() {
        return primaryTaxFilerIndicator;
    }

    /**
     * Sets the value of the primaryTaxFilerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryTaxFilerIndicator(Boolean value) {
        this.primaryTaxFilerIndicator = value;
    }

    /**
     * Gets the value of the spouseTaxFilerAccountMembershipId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpouseTaxFilerAccountMembershipId() {
        return spouseTaxFilerAccountMembershipId;
    }

    /**
     * Sets the value of the spouseTaxFilerAccountMembershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpouseTaxFilerAccountMembershipId(Long value) {
        this.spouseTaxFilerAccountMembershipId = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

}

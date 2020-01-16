//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="application"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicantRelationships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="applicantRelationship" type="{http://services.vida.psi.com/ClientManagement/1.0}applicantRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="esiEligibilityRelationships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="esiEligibilityRelationship" type="{http://services.vida.psi.com/ClientManagement/1.0}esiEligibilityRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="applicants" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="applicant" type="{http://services.vida.psi.com/ClientManagement/1.0}applicant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="applicationEnteredBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationEnteredTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="assisterFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assisterOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assisterOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedSourceDocumentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atoRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizedRepresentative" type="{http://services.vida.psi.com/ClientManagement/1.0}authorizedRepresentative" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstSignatureSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="firstSignatureSignedDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="hasNoEarnedIncomeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasNoUnearnedIncomeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="homeAddress" type="{http://services.vida.psi.com/ClientManagement/1.0}unvalidatedAddress" minOccurs="0"/&gt;
 *         &lt;element name="homeAddressValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ignore" type="{http://services.vida.psi.com/ClientManagement/1.0}typesInclusionHelper" minOccurs="0"/&gt;
 *         &lt;element name="languagePreference" type="{http://services.vida.psi.com/ClientManagement/1.0}languagePreferenceEnum" minOccurs="0"/&gt;
 *         &lt;element name="mailingAddress" type="{http://services.vida.psi.com/ClientManagement/1.0}unvalidatedAddress" minOccurs="0"/&gt;
 *         &lt;element name="mailingAddressValidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="medicaidCaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monthlyIncomeDiscrepancyNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredContactMethod" type="{http://services.vida.psi.com/ClientManagement/1.0}preferredContactMethod" minOccurs="0"/&gt;
 *         &lt;element name="pregnancyDueDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="proofOfIncome" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="renewalMonth" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarMonth" minOccurs="0"/&gt;
 *         &lt;element name="secondSignatureSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="secondSignatureSignedDate" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationSourceEnum" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusReasons" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationStatusReasonEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="webApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application", propOrder = {
    "applicantRelationships",
    "esiEligibilityRelationships",
    "applicants",
    "accountNumber",
    "applicationEnteredBy",
    "applicationEnteredTimestamp",
    "assisterFullName",
    "assisterOrganizationId",
    "assisterOrganizationName",
    "associatedDocumentType",
    "associatedSourceDocumentControlNumber",
    "atoRefId",
    "authorizedRepresentative",
    "cellPhone",
    "emailAddress",
    "firstSignatureSigned",
    "firstSignatureSignedDate",
    "hasNoEarnedIncomeIndicator",
    "hasNoUnearnedIncomeIndicator",
    "homeAddress",
    "homeAddressValidated",
    "homePhone",
    "ignore",
    "languagePreference",
    "mailingAddress",
    "mailingAddressValidated",
    "medicaidCaseNumber",
    "monthlyIncomeDiscrepancyNote",
    "notes",
    "preferredContactMethod",
    "pregnancyDueDate",
    "proofOfIncome",
    "receivedDate",
    "renewalMonth",
    "secondSignatureSigned",
    "secondSignatureSignedDate",
    "source",
    "status",
    "statusDate",
    "statusReasons",
    "type",
    "webApplicationId"
})
public class Application {

    protected Application.ApplicantRelationships applicantRelationships;
    protected Application.EsiEligibilityRelationships esiEligibilityRelationships;
    protected Application.Applicants applicants;
    protected Long accountNumber;
    protected String applicationEnteredBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationEnteredTimestamp;
    protected String assisterFullName;
    protected String assisterOrganizationId;
    protected String assisterOrganizationName;
    protected String associatedDocumentType;
    protected String associatedSourceDocumentControlNumber;
    protected String atoRefId;
    protected AuthorizedRepresentative authorizedRepresentative;
    protected String cellPhone;
    protected String emailAddress;
    protected boolean firstSignatureSigned;
    protected CalendarDay firstSignatureSignedDate;
    protected Boolean hasNoEarnedIncomeIndicator;
    protected Boolean hasNoUnearnedIncomeIndicator;
    protected UnvalidatedAddress homeAddress;
    protected boolean homeAddressValidated;
    protected String homePhone;
    protected TypesInclusionHelper ignore;
    @XmlSchemaType(name = "string")
    protected LanguagePreferenceEnum languagePreference;
    protected UnvalidatedAddress mailingAddress;
    protected boolean mailingAddressValidated;
    protected String medicaidCaseNumber;
    protected String monthlyIncomeDiscrepancyNote;
    protected String notes;
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod preferredContactMethod;
    protected CalendarDay pregnancyDueDate;
    protected Boolean proofOfIncome;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    protected CalendarMonth renewalMonth;
    protected boolean secondSignatureSigned;
    protected CalendarDay secondSignatureSignedDate;
    @XmlSchemaType(name = "string")
    protected ApplicationSourceEnum source;
    @XmlSchemaType(name = "string")
    protected ApplicationStatusEnum status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<ApplicationStatusReasonEnum> statusReasons;
    @XmlSchemaType(name = "string")
    protected ApplicationTypeEnum type;
    protected String webApplicationId;

    /**
     * Gets the value of the applicantRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Application.ApplicantRelationships }
     *     
     */
    public Application.ApplicantRelationships getApplicantRelationships() {
        return applicantRelationships;
    }

    /**
     * Sets the value of the applicantRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.ApplicantRelationships }
     *     
     */
    public void setApplicantRelationships(Application.ApplicantRelationships value) {
        this.applicantRelationships = value;
    }

    /**
     * Gets the value of the esiEligibilityRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Application.EsiEligibilityRelationships }
     *     
     */
    public Application.EsiEligibilityRelationships getEsiEligibilityRelationships() {
        return esiEligibilityRelationships;
    }

    /**
     * Sets the value of the esiEligibilityRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.EsiEligibilityRelationships }
     *     
     */
    public void setEsiEligibilityRelationships(Application.EsiEligibilityRelationships value) {
        this.esiEligibilityRelationships = value;
    }

    /**
     * Gets the value of the applicants property.
     * 
     * @return
     *     possible object is
     *     {@link Application.Applicants }
     *     
     */
    public Application.Applicants getApplicants() {
        return applicants;
    }

    /**
     * Sets the value of the applicants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application.Applicants }
     *     
     */
    public void setApplicants(Application.Applicants value) {
        this.applicants = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the applicationEnteredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationEnteredBy() {
        return applicationEnteredBy;
    }

    /**
     * Sets the value of the applicationEnteredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationEnteredBy(String value) {
        this.applicationEnteredBy = value;
    }

    /**
     * Gets the value of the applicationEnteredTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationEnteredTimestamp() {
        return applicationEnteredTimestamp;
    }

    /**
     * Sets the value of the applicationEnteredTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationEnteredTimestamp(XMLGregorianCalendar value) {
        this.applicationEnteredTimestamp = value;
    }

    /**
     * Gets the value of the assisterFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssisterFullName() {
        return assisterFullName;
    }

    /**
     * Sets the value of the assisterFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssisterFullName(String value) {
        this.assisterFullName = value;
    }

    /**
     * Gets the value of the assisterOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssisterOrganizationId() {
        return assisterOrganizationId;
    }

    /**
     * Sets the value of the assisterOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssisterOrganizationId(String value) {
        this.assisterOrganizationId = value;
    }

    /**
     * Gets the value of the assisterOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssisterOrganizationName() {
        return assisterOrganizationName;
    }

    /**
     * Sets the value of the assisterOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssisterOrganizationName(String value) {
        this.assisterOrganizationName = value;
    }

    /**
     * Gets the value of the associatedDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedDocumentType() {
        return associatedDocumentType;
    }

    /**
     * Sets the value of the associatedDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedDocumentType(String value) {
        this.associatedDocumentType = value;
    }

    /**
     * Gets the value of the associatedSourceDocumentControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedSourceDocumentControlNumber() {
        return associatedSourceDocumentControlNumber;
    }

    /**
     * Sets the value of the associatedSourceDocumentControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedSourceDocumentControlNumber(String value) {
        this.associatedSourceDocumentControlNumber = value;
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
     * Gets the value of the authorizedRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedRepresentative }
     *     
     */
    public AuthorizedRepresentative getAuthorizedRepresentative() {
        return authorizedRepresentative;
    }

    /**
     * Sets the value of the authorizedRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedRepresentative }
     *     
     */
    public void setAuthorizedRepresentative(AuthorizedRepresentative value) {
        this.authorizedRepresentative = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the firstSignatureSigned property.
     * 
     */
    public boolean isFirstSignatureSigned() {
        return firstSignatureSigned;
    }

    /**
     * Sets the value of the firstSignatureSigned property.
     * 
     */
    public void setFirstSignatureSigned(boolean value) {
        this.firstSignatureSigned = value;
    }

    /**
     * Gets the value of the firstSignatureSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getFirstSignatureSignedDate() {
        return firstSignatureSignedDate;
    }

    /**
     * Sets the value of the firstSignatureSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setFirstSignatureSignedDate(CalendarDay value) {
        this.firstSignatureSignedDate = value;
    }

    /**
     * Gets the value of the hasNoEarnedIncomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoEarnedIncomeIndicator() {
        return hasNoEarnedIncomeIndicator;
    }

    /**
     * Sets the value of the hasNoEarnedIncomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNoEarnedIncomeIndicator(Boolean value) {
        this.hasNoEarnedIncomeIndicator = value;
    }

    /**
     * Gets the value of the hasNoUnearnedIncomeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoUnearnedIncomeIndicator() {
        return hasNoUnearnedIncomeIndicator;
    }

    /**
     * Sets the value of the hasNoUnearnedIncomeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNoUnearnedIncomeIndicator(Boolean value) {
        this.hasNoUnearnedIncomeIndicator = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public UnvalidatedAddress getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public void setHomeAddress(UnvalidatedAddress value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeAddressValidated property.
     * 
     */
    public boolean isHomeAddressValidated() {
        return homeAddressValidated;
    }

    /**
     * Sets the value of the homeAddressValidated property.
     * 
     */
    public void setHomeAddressValidated(boolean value) {
        this.homeAddressValidated = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the ignore property.
     * 
     * @return
     *     possible object is
     *     {@link TypesInclusionHelper }
     *     
     */
    public TypesInclusionHelper getIgnore() {
        return ignore;
    }

    /**
     * Sets the value of the ignore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesInclusionHelper }
     *     
     */
    public void setIgnore(TypesInclusionHelper value) {
        this.ignore = value;
    }

    /**
     * Gets the value of the languagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public LanguagePreferenceEnum getLanguagePreference() {
        return languagePreference;
    }

    /**
     * Sets the value of the languagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public void setLanguagePreference(LanguagePreferenceEnum value) {
        this.languagePreference = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public UnvalidatedAddress getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnvalidatedAddress }
     *     
     */
    public void setMailingAddress(UnvalidatedAddress value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the mailingAddressValidated property.
     * 
     */
    public boolean isMailingAddressValidated() {
        return mailingAddressValidated;
    }

    /**
     * Sets the value of the mailingAddressValidated property.
     * 
     */
    public void setMailingAddressValidated(boolean value) {
        this.mailingAddressValidated = value;
    }

    /**
     * Gets the value of the medicaidCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicaidCaseNumber() {
        return medicaidCaseNumber;
    }

    /**
     * Sets the value of the medicaidCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicaidCaseNumber(String value) {
        this.medicaidCaseNumber = value;
    }

    /**
     * Gets the value of the monthlyIncomeDiscrepancyNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyIncomeDiscrepancyNote() {
        return monthlyIncomeDiscrepancyNote;
    }

    /**
     * Sets the value of the monthlyIncomeDiscrepancyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyIncomeDiscrepancyNote(String value) {
        this.monthlyIncomeDiscrepancyNote = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContactMethod }
     *     
     */
    public PreferredContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContactMethod }
     *     
     */
    public void setPreferredContactMethod(PreferredContactMethod value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the pregnancyDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getPregnancyDueDate() {
        return pregnancyDueDate;
    }

    /**
     * Sets the value of the pregnancyDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setPregnancyDueDate(CalendarDay value) {
        this.pregnancyDueDate = value;
    }

    /**
     * Gets the value of the proofOfIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProofOfIncome() {
        return proofOfIncome;
    }

    /**
     * Sets the value of the proofOfIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProofOfIncome(Boolean value) {
        this.proofOfIncome = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the renewalMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarMonth }
     *     
     */
    public CalendarMonth getRenewalMonth() {
        return renewalMonth;
    }

    /**
     * Sets the value of the renewalMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarMonth }
     *     
     */
    public void setRenewalMonth(CalendarMonth value) {
        this.renewalMonth = value;
    }

    /**
     * Gets the value of the secondSignatureSigned property.
     * 
     */
    public boolean isSecondSignatureSigned() {
        return secondSignatureSigned;
    }

    /**
     * Sets the value of the secondSignatureSigned property.
     * 
     */
    public void setSecondSignatureSigned(boolean value) {
        this.secondSignatureSigned = value;
    }

    /**
     * Gets the value of the secondSignatureSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getSecondSignatureSignedDate() {
        return secondSignatureSignedDate;
    }

    /**
     * Sets the value of the secondSignatureSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setSecondSignatureSignedDate(CalendarDay value) {
        this.secondSignatureSignedDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSourceEnum }
     *     
     */
    public ApplicationSourceEnum getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSourceEnum }
     *     
     */
    public void setSource(ApplicationSourceEnum value) {
        this.source = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusEnum }
     *     
     */
    public ApplicationStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusEnum }
     *     
     */
    public void setStatus(ApplicationStatusEnum value) {
        this.status = value;
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

    /**
     * Gets the value of the statusReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationStatusReasonEnum }
     * 
     * 
     */
    public List<ApplicationStatusReasonEnum> getStatusReasons() {
        if (statusReasons == null) {
            statusReasons = new ArrayList<ApplicationStatusReasonEnum>();
        }
        return this.statusReasons;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public ApplicationTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public void setType(ApplicationTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the webApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebApplicationId() {
        return webApplicationId;
    }

    /**
     * Sets the value of the webApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebApplicationId(String value) {
        this.webApplicationId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="applicantRelationship" type="{http://services.vida.psi.com/ClientManagement/1.0}applicantRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicantRelationship"
    })
    public static class ApplicantRelationships {

        protected List<ApplicantRelationship> applicantRelationship;

        /**
         * Gets the value of the applicantRelationship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicantRelationship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicantRelationship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApplicantRelationship }
         * 
         * 
         */
        public List<ApplicantRelationship> getApplicantRelationship() {
            if (applicantRelationship == null) {
                applicantRelationship = new ArrayList<ApplicantRelationship>();
            }
            return this.applicantRelationship;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="applicant" type="{http://services.vida.psi.com/ClientManagement/1.0}applicant" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicant"
    })
    public static class Applicants {

        protected List<Applicant> applicant;

        /**
         * Gets the value of the applicant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Applicant }
         * 
         * 
         */
        public List<Applicant> getApplicant() {
            if (applicant == null) {
                applicant = new ArrayList<Applicant>();
            }
            return this.applicant;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="esiEligibilityRelationship" type="{http://services.vida.psi.com/ClientManagement/1.0}esiEligibilityRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "esiEligibilityRelationship"
    })
    public static class EsiEligibilityRelationships {

        protected List<EsiEligibilityRelationship> esiEligibilityRelationship;

        /**
         * Gets the value of the esiEligibilityRelationship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the esiEligibilityRelationship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEsiEligibilityRelationship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EsiEligibilityRelationship }
         * 
         * 
         */
        public List<EsiEligibilityRelationship> getEsiEligibilityRelationship() {
            if (esiEligibilityRelationship == null) {
                esiEligibilityRelationship = new ArrayList<EsiEligibilityRelationship>();
            }
            return this.esiEligibilityRelationship;
        }

    }

}

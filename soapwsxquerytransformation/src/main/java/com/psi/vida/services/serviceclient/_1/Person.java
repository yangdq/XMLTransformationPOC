//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.22 at 11:47:15 AM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blindOrDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="caretaker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="citizenshipDocumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="citizenshipFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}citizenshipFactors" minOccurs="0"/&gt;
 *         &lt;element name="citizenshipManualTriedDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="cmsEligibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cmsEligibilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="deceased" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deceasedDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="declaredUsCitizenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="employmentFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}employmentFactors" minOccurs="0"/&gt;
 *         &lt;element name="fosterCare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fullTimeStudent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://services.vida.psi.com/ServiceClient/1.0}genderEnum" minOccurs="0"/&gt;
 *         &lt;element name="hsmvVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hsmvVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identityDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}identityFactors" minOccurs="0"/&gt;
 *         &lt;element name="identityVerifiedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="immigrationFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}immigrationFactors" minOccurs="0"/&gt;
 *         &lt;element name="incarcerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="limitedInAnyWay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicaidEligibilityEndDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="medicaidMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="medicaidMatchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="medicaidMatchStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="medicaidNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="memberNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://services.vida.psi.com/ServiceClient/1.0}personName" minOccurs="0"/&gt;
 *         &lt;element name="needsSpecialTherapy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberOfBabiesDue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="personNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="race1" type="{http://services.vida.psi.com/ServiceClient/1.0}raceEnum" minOccurs="0"/&gt;
 *         &lt;element name="race2" type="{http://services.vida.psi.com/ServiceClient/1.0}raceEnum" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssnApplicationDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="stateEmployeeVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="stateEmployeeVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="taxationFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}taxationFactors" minOccurs="0"/&gt;
 *         &lt;element name="tribalFactors" type="{http://services.vida.psi.com/ServiceClient/1.0}tribalFactors" minOccurs="0"/&gt;
 *         &lt;element name="tribalMembershipDocumentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unpaidMedicalBillsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="usEntryDate" type="{http://services.vida.psi.com/ServiceClient/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="uscisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usesMoreMedicalCareThenUsual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="veteranStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "blindOrDisabled",
    "caretaker",
    "citizenshipDocumentId",
    "citizenshipFactors",
    "citizenshipManualTriedDate",
    "cmsEligibility",
    "cmsEligibilityDate",
    "dateOfBirth",
    "deceased",
    "deceasedDate",
    "declaredUsCitizenIndicator",
    "employmentFactors",
    "fosterCare",
    "fullTimeStudent",
    "gender",
    "hsmvVerified",
    "hsmvVerifiedDate",
    "identityDocumentId",
    "identityFactors",
    "identityVerifiedFlag",
    "immigrationFactors",
    "incarcerated",
    "jpaVersion",
    "limitedInAnyWay",
    "mecId",
    "medicaidEligibilityEndDate",
    "medicaidMatch",
    "medicaidMatchDate",
    "medicaidMatchStatusDate",
    "medicaidNumber",
    "memberNumber",
    "name",
    "needsSpecialTherapy",
    "numberOfBabiesDue",
    "personId",
    "personNumber",
    "pregnant",
    "race1",
    "race2",
    "ssn",
    "ssnApplicationDate",
    "stateEmployeeVerified",
    "stateEmployeeVerifiedDate",
    "taxationFactors",
    "tribalFactors",
    "tribalMembershipDocumentId",
    "unpaidMedicalBillsIndicator",
    "usEntryDate",
    "uscisNumber",
    "usesMoreMedicalCareThenUsual",
    "veteranStatus",
    "workPhone"
})
public class Person {

    protected Boolean blindOrDisabled;
    protected Boolean caretaker;
    protected Long citizenshipDocumentId;
    protected CitizenshipFactors citizenshipFactors;
    protected CalendarDay citizenshipManualTriedDate;
    protected Boolean cmsEligibility;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cmsEligibilityDate;
    protected CalendarDay dateOfBirth;
    protected boolean deceased;
    protected CalendarDay deceasedDate;
    protected Boolean declaredUsCitizenIndicator;
    protected EmploymentFactors employmentFactors;
    protected Boolean fosterCare;
    protected Boolean fullTimeStudent;
    @XmlSchemaType(name = "string")
    protected GenderEnum gender;
    protected Boolean hsmvVerified;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hsmvVerifiedDate;
    protected String identityDocumentId;
    protected IdentityFactors identityFactors;
    protected boolean identityVerifiedFlag;
    protected ImmigrationFactors immigrationFactors;
    protected Boolean incarcerated;
    protected Long jpaVersion;
    protected Boolean limitedInAnyWay;
    protected String mecId;
    protected CalendarDay medicaidEligibilityEndDate;
    protected Boolean medicaidMatch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar medicaidMatchDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar medicaidMatchStatusDate;
    protected String medicaidNumber;
    protected Long memberNumber;
    protected PersonName name;
    protected Boolean needsSpecialTherapy;
    protected Integer numberOfBabiesDue;
    protected Long personId;
    protected Long personNumber;
    protected Boolean pregnant;
    @XmlSchemaType(name = "string")
    protected RaceEnum race1;
    @XmlSchemaType(name = "string")
    protected RaceEnum race2;
    protected String ssn;
    protected CalendarDay ssnApplicationDate;
    protected Boolean stateEmployeeVerified;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stateEmployeeVerifiedDate;
    protected TaxationFactors taxationFactors;
    protected TribalFactors tribalFactors;
    protected Long tribalMembershipDocumentId;
    protected Boolean unpaidMedicalBillsIndicator;
    protected CalendarDay usEntryDate;
    protected String uscisNumber;
    protected Boolean usesMoreMedicalCareThenUsual;
    protected Boolean veteranStatus;
    protected String workPhone;

    /**
     * Gets the value of the blindOrDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlindOrDisabled() {
        return blindOrDisabled;
    }

    /**
     * Sets the value of the blindOrDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlindOrDisabled(Boolean value) {
        this.blindOrDisabled = value;
    }

    /**
     * Gets the value of the caretaker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaretaker() {
        return caretaker;
    }

    /**
     * Sets the value of the caretaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaretaker(Boolean value) {
        this.caretaker = value;
    }

    /**
     * Gets the value of the citizenshipDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCitizenshipDocumentId() {
        return citizenshipDocumentId;
    }

    /**
     * Sets the value of the citizenshipDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCitizenshipDocumentId(Long value) {
        this.citizenshipDocumentId = value;
    }

    /**
     * Gets the value of the citizenshipFactors property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenshipFactors }
     *     
     */
    public CitizenshipFactors getCitizenshipFactors() {
        return citizenshipFactors;
    }

    /**
     * Sets the value of the citizenshipFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenshipFactors }
     *     
     */
    public void setCitizenshipFactors(CitizenshipFactors value) {
        this.citizenshipFactors = value;
    }

    /**
     * Gets the value of the citizenshipManualTriedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getCitizenshipManualTriedDate() {
        return citizenshipManualTriedDate;
    }

    /**
     * Sets the value of the citizenshipManualTriedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setCitizenshipManualTriedDate(CalendarDay value) {
        this.citizenshipManualTriedDate = value;
    }

    /**
     * Gets the value of the cmsEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmsEligibility() {
        return cmsEligibility;
    }

    /**
     * Sets the value of the cmsEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmsEligibility(Boolean value) {
        this.cmsEligibility = value;
    }

    /**
     * Gets the value of the cmsEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCmsEligibilityDate() {
        return cmsEligibilityDate;
    }

    /**
     * Sets the value of the cmsEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCmsEligibilityDate(XMLGregorianCalendar value) {
        this.cmsEligibilityDate = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setDateOfBirth(CalendarDay value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     */
    public boolean isDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     */
    public void setDeceased(boolean value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setDeceasedDate(CalendarDay value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the declaredUsCitizenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclaredUsCitizenIndicator() {
        return declaredUsCitizenIndicator;
    }

    /**
     * Sets the value of the declaredUsCitizenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclaredUsCitizenIndicator(Boolean value) {
        this.declaredUsCitizenIndicator = value;
    }

    /**
     * Gets the value of the employmentFactors property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentFactors }
     *     
     */
    public EmploymentFactors getEmploymentFactors() {
        return employmentFactors;
    }

    /**
     * Sets the value of the employmentFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentFactors }
     *     
     */
    public void setEmploymentFactors(EmploymentFactors value) {
        this.employmentFactors = value;
    }

    /**
     * Gets the value of the fosterCare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFosterCare() {
        return fosterCare;
    }

    /**
     * Sets the value of the fosterCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFosterCare(Boolean value) {
        this.fosterCare = value;
    }

    /**
     * Gets the value of the fullTimeStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullTimeStudent() {
        return fullTimeStudent;
    }

    /**
     * Sets the value of the fullTimeStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullTimeStudent(Boolean value) {
        this.fullTimeStudent = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderEnum }
     *     
     */
    public GenderEnum getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderEnum }
     *     
     */
    public void setGender(GenderEnum value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hsmvVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHsmvVerified() {
        return hsmvVerified;
    }

    /**
     * Sets the value of the hsmvVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHsmvVerified(Boolean value) {
        this.hsmvVerified = value;
    }

    /**
     * Gets the value of the hsmvVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHsmvVerifiedDate() {
        return hsmvVerifiedDate;
    }

    /**
     * Sets the value of the hsmvVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHsmvVerifiedDate(XMLGregorianCalendar value) {
        this.hsmvVerifiedDate = value;
    }

    /**
     * Gets the value of the identityDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocumentId() {
        return identityDocumentId;
    }

    /**
     * Sets the value of the identityDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocumentId(String value) {
        this.identityDocumentId = value;
    }

    /**
     * Gets the value of the identityFactors property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityFactors }
     *     
     */
    public IdentityFactors getIdentityFactors() {
        return identityFactors;
    }

    /**
     * Sets the value of the identityFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityFactors }
     *     
     */
    public void setIdentityFactors(IdentityFactors value) {
        this.identityFactors = value;
    }

    /**
     * Gets the value of the identityVerifiedFlag property.
     * 
     */
    public boolean isIdentityVerifiedFlag() {
        return identityVerifiedFlag;
    }

    /**
     * Sets the value of the identityVerifiedFlag property.
     * 
     */
    public void setIdentityVerifiedFlag(boolean value) {
        this.identityVerifiedFlag = value;
    }

    /**
     * Gets the value of the immigrationFactors property.
     * 
     * @return
     *     possible object is
     *     {@link ImmigrationFactors }
     *     
     */
    public ImmigrationFactors getImmigrationFactors() {
        return immigrationFactors;
    }

    /**
     * Sets the value of the immigrationFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmigrationFactors }
     *     
     */
    public void setImmigrationFactors(ImmigrationFactors value) {
        this.immigrationFactors = value;
    }

    /**
     * Gets the value of the incarcerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncarcerated() {
        return incarcerated;
    }

    /**
     * Sets the value of the incarcerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncarcerated(Boolean value) {
        this.incarcerated = value;
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
     * Gets the value of the limitedInAnyWay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitedInAnyWay() {
        return limitedInAnyWay;
    }

    /**
     * Sets the value of the limitedInAnyWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitedInAnyWay(Boolean value) {
        this.limitedInAnyWay = value;
    }

    /**
     * Gets the value of the mecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMecId() {
        return mecId;
    }

    /**
     * Sets the value of the mecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMecId(String value) {
        this.mecId = value;
    }

    /**
     * Gets the value of the medicaidEligibilityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getMedicaidEligibilityEndDate() {
        return medicaidEligibilityEndDate;
    }

    /**
     * Sets the value of the medicaidEligibilityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setMedicaidEligibilityEndDate(CalendarDay value) {
        this.medicaidEligibilityEndDate = value;
    }

    /**
     * Gets the value of the medicaidMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMedicaidMatch() {
        return medicaidMatch;
    }

    /**
     * Sets the value of the medicaidMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMedicaidMatch(Boolean value) {
        this.medicaidMatch = value;
    }

    /**
     * Gets the value of the medicaidMatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMedicaidMatchDate() {
        return medicaidMatchDate;
    }

    /**
     * Sets the value of the medicaidMatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMedicaidMatchDate(XMLGregorianCalendar value) {
        this.medicaidMatchDate = value;
    }

    /**
     * Gets the value of the medicaidMatchStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMedicaidMatchStatusDate() {
        return medicaidMatchStatusDate;
    }

    /**
     * Sets the value of the medicaidMatchStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMedicaidMatchStatusDate(XMLGregorianCalendar value) {
        this.medicaidMatchStatusDate = value;
    }

    /**
     * Gets the value of the medicaidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicaidNumber() {
        return medicaidNumber;
    }

    /**
     * Sets the value of the medicaidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicaidNumber(String value) {
        this.medicaidNumber = value;
    }

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemberNumber(Long value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setName(PersonName value) {
        this.name = value;
    }

    /**
     * Gets the value of the needsSpecialTherapy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedsSpecialTherapy() {
        return needsSpecialTherapy;
    }

    /**
     * Sets the value of the needsSpecialTherapy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedsSpecialTherapy(Boolean value) {
        this.needsSpecialTherapy = value;
    }

    /**
     * Gets the value of the numberOfBabiesDue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBabiesDue() {
        return numberOfBabiesDue;
    }

    /**
     * Sets the value of the numberOfBabiesDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBabiesDue(Integer value) {
        this.numberOfBabiesDue = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the personNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonNumber() {
        return personNumber;
    }

    /**
     * Sets the value of the personNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonNumber(Long value) {
        this.personNumber = value;
    }

    /**
     * Gets the value of the pregnant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPregnant() {
        return pregnant;
    }

    /**
     * Sets the value of the pregnant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPregnant(Boolean value) {
        this.pregnant = value;
    }

    /**
     * Gets the value of the race1 property.
     * 
     * @return
     *     possible object is
     *     {@link RaceEnum }
     *     
     */
    public RaceEnum getRace1() {
        return race1;
    }

    /**
     * Sets the value of the race1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceEnum }
     *     
     */
    public void setRace1(RaceEnum value) {
        this.race1 = value;
    }

    /**
     * Gets the value of the race2 property.
     * 
     * @return
     *     possible object is
     *     {@link RaceEnum }
     *     
     */
    public RaceEnum getRace2() {
        return race2;
    }

    /**
     * Sets the value of the race2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceEnum }
     *     
     */
    public void setRace2(RaceEnum value) {
        this.race2 = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the ssnApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getSsnApplicationDate() {
        return ssnApplicationDate;
    }

    /**
     * Sets the value of the ssnApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setSsnApplicationDate(CalendarDay value) {
        this.ssnApplicationDate = value;
    }

    /**
     * Gets the value of the stateEmployeeVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStateEmployeeVerified() {
        return stateEmployeeVerified;
    }

    /**
     * Sets the value of the stateEmployeeVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStateEmployeeVerified(Boolean value) {
        this.stateEmployeeVerified = value;
    }

    /**
     * Gets the value of the stateEmployeeVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateEmployeeVerifiedDate() {
        return stateEmployeeVerifiedDate;
    }

    /**
     * Sets the value of the stateEmployeeVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateEmployeeVerifiedDate(XMLGregorianCalendar value) {
        this.stateEmployeeVerifiedDate = value;
    }

    /**
     * Gets the value of the taxationFactors property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationFactors }
     *     
     */
    public TaxationFactors getTaxationFactors() {
        return taxationFactors;
    }

    /**
     * Sets the value of the taxationFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationFactors }
     *     
     */
    public void setTaxationFactors(TaxationFactors value) {
        this.taxationFactors = value;
    }

    /**
     * Gets the value of the tribalFactors property.
     * 
     * @return
     *     possible object is
     *     {@link TribalFactors }
     *     
     */
    public TribalFactors getTribalFactors() {
        return tribalFactors;
    }

    /**
     * Sets the value of the tribalFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TribalFactors }
     *     
     */
    public void setTribalFactors(TribalFactors value) {
        this.tribalFactors = value;
    }

    /**
     * Gets the value of the tribalMembershipDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTribalMembershipDocumentId() {
        return tribalMembershipDocumentId;
    }

    /**
     * Sets the value of the tribalMembershipDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTribalMembershipDocumentId(Long value) {
        this.tribalMembershipDocumentId = value;
    }

    /**
     * Gets the value of the unpaidMedicalBillsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnpaidMedicalBillsIndicator() {
        return unpaidMedicalBillsIndicator;
    }

    /**
     * Sets the value of the unpaidMedicalBillsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnpaidMedicalBillsIndicator(Boolean value) {
        this.unpaidMedicalBillsIndicator = value;
    }

    /**
     * Gets the value of the usEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getUsEntryDate() {
        return usEntryDate;
    }

    /**
     * Sets the value of the usEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setUsEntryDate(CalendarDay value) {
        this.usEntryDate = value;
    }

    /**
     * Gets the value of the uscisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUscisNumber() {
        return uscisNumber;
    }

    /**
     * Sets the value of the uscisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUscisNumber(String value) {
        this.uscisNumber = value;
    }

    /**
     * Gets the value of the usesMoreMedicalCareThenUsual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesMoreMedicalCareThenUsual() {
        return usesMoreMedicalCareThenUsual;
    }

    /**
     * Sets the value of the usesMoreMedicalCareThenUsual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesMoreMedicalCareThenUsual(Boolean value) {
        this.usesMoreMedicalCareThenUsual = value;
    }

    /**
     * Gets the value of the veteranStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeteranStatus() {
        return veteranStatus;
    }

    /**
     * Sets the value of the veteranStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeteranStatus(Boolean value) {
        this.veteranStatus = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

}

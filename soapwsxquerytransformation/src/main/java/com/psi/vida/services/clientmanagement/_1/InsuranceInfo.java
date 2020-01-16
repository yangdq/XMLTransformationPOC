//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceProviders" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="insuranceProvider" type="{http://services.vida.psi.com/ClientManagement/1.0}insuranceProviderEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="employerInsuranceCobra" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="employerInsuranceProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employerInsuranceRetiree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasHealthInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="insuranceMonthlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="otherInsurancePolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherInsuranceProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceInfo", propOrder = {
    "insuranceProviders",
    "employerInsuranceCobra",
    "employerInsuranceProviderName",
    "employerInsuranceRetiree",
    "hasHealthInsurance",
    "insuranceMonthlyCost",
    "otherInsurancePolicyNumber",
    "otherInsuranceProviderName"
})
public class InsuranceInfo {

    protected InsuranceInfo.InsuranceProviders insuranceProviders;
    protected Boolean employerInsuranceCobra;
    protected String employerInsuranceProviderName;
    protected Boolean employerInsuranceRetiree;
    protected Boolean hasHealthInsurance;
    protected BigDecimal insuranceMonthlyCost;
    protected String otherInsurancePolicyNumber;
    protected String otherInsuranceProviderName;

    /**
     * Gets the value of the insuranceProviders property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceInfo.InsuranceProviders }
     *     
     */
    public InsuranceInfo.InsuranceProviders getInsuranceProviders() {
        return insuranceProviders;
    }

    /**
     * Sets the value of the insuranceProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceInfo.InsuranceProviders }
     *     
     */
    public void setInsuranceProviders(InsuranceInfo.InsuranceProviders value) {
        this.insuranceProviders = value;
    }

    /**
     * Gets the value of the employerInsuranceCobra property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployerInsuranceCobra() {
        return employerInsuranceCobra;
    }

    /**
     * Sets the value of the employerInsuranceCobra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployerInsuranceCobra(Boolean value) {
        this.employerInsuranceCobra = value;
    }

    /**
     * Gets the value of the employerInsuranceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerInsuranceProviderName() {
        return employerInsuranceProviderName;
    }

    /**
     * Sets the value of the employerInsuranceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerInsuranceProviderName(String value) {
        this.employerInsuranceProviderName = value;
    }

    /**
     * Gets the value of the employerInsuranceRetiree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployerInsuranceRetiree() {
        return employerInsuranceRetiree;
    }

    /**
     * Sets the value of the employerInsuranceRetiree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployerInsuranceRetiree(Boolean value) {
        this.employerInsuranceRetiree = value;
    }

    /**
     * Gets the value of the hasHealthInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    /**
     * Sets the value of the hasHealthInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHealthInsurance(Boolean value) {
        this.hasHealthInsurance = value;
    }

    /**
     * Gets the value of the insuranceMonthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceMonthlyCost() {
        return insuranceMonthlyCost;
    }

    /**
     * Sets the value of the insuranceMonthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceMonthlyCost(BigDecimal value) {
        this.insuranceMonthlyCost = value;
    }

    /**
     * Gets the value of the otherInsurancePolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsurancePolicyNumber() {
        return otherInsurancePolicyNumber;
    }

    /**
     * Sets the value of the otherInsurancePolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsurancePolicyNumber(String value) {
        this.otherInsurancePolicyNumber = value;
    }

    /**
     * Gets the value of the otherInsuranceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsuranceProviderName() {
        return otherInsuranceProviderName;
    }

    /**
     * Sets the value of the otherInsuranceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsuranceProviderName(String value) {
        this.otherInsuranceProviderName = value;
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
     *         &lt;element name="insuranceProvider" type="{http://services.vida.psi.com/ClientManagement/1.0}insuranceProviderEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "insuranceProvider"
    })
    public static class InsuranceProviders {

        @XmlSchemaType(name = "string")
        protected List<InsuranceProviderEnum> insuranceProvider;

        /**
         * Gets the value of the insuranceProvider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insuranceProvider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInsuranceProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceProviderEnum }
         * 
         * 
         */
        public List<InsuranceProviderEnum> getInsuranceProvider() {
            if (insuranceProvider == null) {
                insuranceProvider = new ArrayList<InsuranceProviderEnum>();
            }
            return this.insuranceProvider;
        }

    }

}

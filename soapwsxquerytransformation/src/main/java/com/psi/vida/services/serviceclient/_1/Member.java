//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountMembership" type="{http://services.vida.psi.com/ServiceClient/1.0}accountMembership" minOccurs="0"/>
 *         &lt;element name="availableDentalPlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dentalPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}healthPlan" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="availableHealthPlans" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}healthPlan" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expenseMissingInfoItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expenseMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}expenseMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="expense" type="{http://services.vida.psi.com/ServiceClient/1.0}expense" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incomeMissingInfoItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="incomeMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}incomeMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incomes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="income" type="{http://services.vida.psi.com/ServiceClient/1.0}income" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="memberMissingInfoItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}externalMemberMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="currentEnrolledHealthPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}enrolledHealthPlan" minOccurs="0"/>
 *         &lt;element name="healthPlanChangeRequest" type="{http://services.vida.psi.com/ServiceClient/1.0}healthPlanChangeRequest" minOccurs="0"/>
 *         &lt;element name="inDentalChoicePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inMedicalChoicePeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nextMonthEnrolledHealthPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}enrolledHealthPlan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member", propOrder = {
    "accountMembership",
    "availableDentalPlans",
    "availableHealthPlans",
    "expenseMissingInfoItems",
    "expenses",
    "incomeMissingInfoItems",
    "incomes",
    "memberMissingInfoItems",
    "currentEnrolledHealthPlan",
    "healthPlanChangeRequest",
    "inDentalChoicePeriod",
    "inMedicalChoicePeriod",
    "nextMonthEnrolledHealthPlan"
})
public class Member {

    protected AccountMembership accountMembership;
    protected Member.AvailableDentalPlans availableDentalPlans;
    protected Member.AvailableHealthPlans availableHealthPlans;
    protected Member.ExpenseMissingInfoItems expenseMissingInfoItems;
    protected Member.Expenses expenses;
    protected Member.IncomeMissingInfoItems incomeMissingInfoItems;
    protected Member.Incomes incomes;
    protected Member.MemberMissingInfoItems memberMissingInfoItems;
    protected EnrolledHealthPlan currentEnrolledHealthPlan;
    protected HealthPlanChangeRequest healthPlanChangeRequest;
    protected boolean inDentalChoicePeriod;
    protected boolean inMedicalChoicePeriod;
    protected EnrolledHealthPlan nextMonthEnrolledHealthPlan;

    /**
     * Gets the value of the accountMembership property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMembership }
     *     
     */
    public AccountMembership getAccountMembership() {
        return accountMembership;
    }

    /**
     * Sets the value of the accountMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMembership }
     *     
     */
    public void setAccountMembership(AccountMembership value) {
        this.accountMembership = value;
    }

    /**
     * Gets the value of the availableDentalPlans property.
     * 
     * @return
     *     possible object is
     *     {@link Member.AvailableDentalPlans }
     *     
     */
    public Member.AvailableDentalPlans getAvailableDentalPlans() {
        return availableDentalPlans;
    }

    /**
     * Sets the value of the availableDentalPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.AvailableDentalPlans }
     *     
     */
    public void setAvailableDentalPlans(Member.AvailableDentalPlans value) {
        this.availableDentalPlans = value;
    }

    /**
     * Gets the value of the availableHealthPlans property.
     * 
     * @return
     *     possible object is
     *     {@link Member.AvailableHealthPlans }
     *     
     */
    public Member.AvailableHealthPlans getAvailableHealthPlans() {
        return availableHealthPlans;
    }

    /**
     * Sets the value of the availableHealthPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.AvailableHealthPlans }
     *     
     */
    public void setAvailableHealthPlans(Member.AvailableHealthPlans value) {
        this.availableHealthPlans = value;
    }

    /**
     * Gets the value of the expenseMissingInfoItems property.
     * 
     * @return
     *     possible object is
     *     {@link Member.ExpenseMissingInfoItems }
     *     
     */
    public Member.ExpenseMissingInfoItems getExpenseMissingInfoItems() {
        return expenseMissingInfoItems;
    }

    /**
     * Sets the value of the expenseMissingInfoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.ExpenseMissingInfoItems }
     *     
     */
    public void setExpenseMissingInfoItems(Member.ExpenseMissingInfoItems value) {
        this.expenseMissingInfoItems = value;
    }

    /**
     * Gets the value of the expenses property.
     * 
     * @return
     *     possible object is
     *     {@link Member.Expenses }
     *     
     */
    public Member.Expenses getExpenses() {
        return expenses;
    }

    /**
     * Sets the value of the expenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.Expenses }
     *     
     */
    public void setExpenses(Member.Expenses value) {
        this.expenses = value;
    }

    /**
     * Gets the value of the incomeMissingInfoItems property.
     * 
     * @return
     *     possible object is
     *     {@link Member.IncomeMissingInfoItems }
     *     
     */
    public Member.IncomeMissingInfoItems getIncomeMissingInfoItems() {
        return incomeMissingInfoItems;
    }

    /**
     * Sets the value of the incomeMissingInfoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.IncomeMissingInfoItems }
     *     
     */
    public void setIncomeMissingInfoItems(Member.IncomeMissingInfoItems value) {
        this.incomeMissingInfoItems = value;
    }

    /**
     * Gets the value of the incomes property.
     * 
     * @return
     *     possible object is
     *     {@link Member.Incomes }
     *     
     */
    public Member.Incomes getIncomes() {
        return incomes;
    }

    /**
     * Sets the value of the incomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.Incomes }
     *     
     */
    public void setIncomes(Member.Incomes value) {
        this.incomes = value;
    }

    /**
     * Gets the value of the memberMissingInfoItems property.
     * 
     * @return
     *     possible object is
     *     {@link Member.MemberMissingInfoItems }
     *     
     */
    public Member.MemberMissingInfoItems getMemberMissingInfoItems() {
        return memberMissingInfoItems;
    }

    /**
     * Sets the value of the memberMissingInfoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member.MemberMissingInfoItems }
     *     
     */
    public void setMemberMissingInfoItems(Member.MemberMissingInfoItems value) {
        this.memberMissingInfoItems = value;
    }

    /**
     * Gets the value of the currentEnrolledHealthPlan property.
     * 
     * @return
     *     possible object is
     *     {@link EnrolledHealthPlan }
     *     
     */
    public EnrolledHealthPlan getCurrentEnrolledHealthPlan() {
        return currentEnrolledHealthPlan;
    }

    /**
     * Sets the value of the currentEnrolledHealthPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrolledHealthPlan }
     *     
     */
    public void setCurrentEnrolledHealthPlan(EnrolledHealthPlan value) {
        this.currentEnrolledHealthPlan = value;
    }

    /**
     * Gets the value of the healthPlanChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HealthPlanChangeRequest }
     *     
     */
    public HealthPlanChangeRequest getHealthPlanChangeRequest() {
        return healthPlanChangeRequest;
    }

    /**
     * Sets the value of the healthPlanChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthPlanChangeRequest }
     *     
     */
    public void setHealthPlanChangeRequest(HealthPlanChangeRequest value) {
        this.healthPlanChangeRequest = value;
    }

    /**
     * Gets the value of the inDentalChoicePeriod property.
     * 
     */
    public boolean isInDentalChoicePeriod() {
        return inDentalChoicePeriod;
    }

    /**
     * Sets the value of the inDentalChoicePeriod property.
     * 
     */
    public void setInDentalChoicePeriod(boolean value) {
        this.inDentalChoicePeriod = value;
    }

    /**
     * Gets the value of the inMedicalChoicePeriod property.
     * 
     */
    public boolean isInMedicalChoicePeriod() {
        return inMedicalChoicePeriod;
    }

    /**
     * Sets the value of the inMedicalChoicePeriod property.
     * 
     */
    public void setInMedicalChoicePeriod(boolean value) {
        this.inMedicalChoicePeriod = value;
    }

    /**
     * Gets the value of the nextMonthEnrolledHealthPlan property.
     * 
     * @return
     *     possible object is
     *     {@link EnrolledHealthPlan }
     *     
     */
    public EnrolledHealthPlan getNextMonthEnrolledHealthPlan() {
        return nextMonthEnrolledHealthPlan;
    }

    /**
     * Sets the value of the nextMonthEnrolledHealthPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrolledHealthPlan }
     *     
     */
    public void setNextMonthEnrolledHealthPlan(EnrolledHealthPlan value) {
        this.nextMonthEnrolledHealthPlan = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dentalPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}healthPlan" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dentalPlan"
    })
    public static class AvailableDentalPlans {

        protected List<HealthPlan> dentalPlan;

        /**
         * Gets the value of the dentalPlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dentalPlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDentalPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthPlan }
         * 
         * 
         */
        public List<HealthPlan> getDentalPlan() {
            if (dentalPlan == null) {
                dentalPlan = new ArrayList<HealthPlan>();
            }
            return this.dentalPlan;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="healthPlan" type="{http://services.vida.psi.com/ServiceClient/1.0}healthPlan" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "healthPlan"
    })
    public static class AvailableHealthPlans {

        protected List<HealthPlan> healthPlan;

        /**
         * Gets the value of the healthPlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the healthPlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHealthPlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthPlan }
         * 
         * 
         */
        public List<HealthPlan> getHealthPlan() {
            if (healthPlan == null) {
                healthPlan = new ArrayList<HealthPlan>();
            }
            return this.healthPlan;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="expenseMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}expenseMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expenseMissingInfoItem"
    })
    public static class ExpenseMissingInfoItems {

        protected List<ExpenseMissingInfoEnum> expenseMissingInfoItem;

        /**
         * Gets the value of the expenseMissingInfoItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expenseMissingInfoItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpenseMissingInfoItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExpenseMissingInfoEnum }
         * 
         * 
         */
        public List<ExpenseMissingInfoEnum> getExpenseMissingInfoItem() {
            if (expenseMissingInfoItem == null) {
                expenseMissingInfoItem = new ArrayList<ExpenseMissingInfoEnum>();
            }
            return this.expenseMissingInfoItem;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="expense" type="{http://services.vida.psi.com/ServiceClient/1.0}expense" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expense"
    })
    public static class Expenses {

        protected List<Expense> expense;

        /**
         * Gets the value of the expense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the expense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExpense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Expense }
         * 
         * 
         */
        public List<Expense> getExpense() {
            if (expense == null) {
                expense = new ArrayList<Expense>();
            }
            return this.expense;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="incomeMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}incomeMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "incomeMissingInfoItem"
    })
    public static class IncomeMissingInfoItems {

        protected List<IncomeMissingInfoEnum> incomeMissingInfoItem;

        /**
         * Gets the value of the incomeMissingInfoItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incomeMissingInfoItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncomeMissingInfoItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IncomeMissingInfoEnum }
         * 
         * 
         */
        public List<IncomeMissingInfoEnum> getIncomeMissingInfoItem() {
            if (incomeMissingInfoItem == null) {
                incomeMissingInfoItem = new ArrayList<IncomeMissingInfoEnum>();
            }
            return this.incomeMissingInfoItem;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="income" type="{http://services.vida.psi.com/ServiceClient/1.0}income" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "income"
    })
    public static class Incomes {

        protected List<Income> income;

        /**
         * Gets the value of the income property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the income property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncome().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Income }
         * 
         * 
         */
        public List<Income> getIncome() {
            if (income == null) {
                income = new ArrayList<Income>();
            }
            return this.income;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="memberMissingInfoItem" type="{http://services.vida.psi.com/ServiceClient/1.0}externalMemberMissingInfoEnum" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberMissingInfoItem"
    })
    public static class MemberMissingInfoItems {

        protected List<ExternalMemberMissingInfoEnum> memberMissingInfoItem;

        /**
         * Gets the value of the memberMissingInfoItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberMissingInfoItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberMissingInfoItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExternalMemberMissingInfoEnum }
         * 
         * 
         */
        public List<ExternalMemberMissingInfoEnum> getMemberMissingInfoItem() {
            if (memberMissingInfoItem == null) {
                memberMissingInfoItem = new ArrayList<ExternalMemberMissingInfoEnum>();
            }
            return this.memberMissingInfoItem;
        }

    }

}
package com.maximus.xmltransformer.pojo;

public class Customer {
	private String customerName;
	private int age;

	public Customer() {
	}

	public Customer(String customerName, int age) {
		super();
		this.customerName = customerName;
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age = i;
	}
}

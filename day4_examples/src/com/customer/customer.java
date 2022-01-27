package com.customer;

import com.dao.*;
import com.customService.*;

public class customer {
	private String customerId, name, mobileNumber, email, transactions;
	
	public customer(String customerId, String name, String mobileNumber, String email, String transactions) {
		this.customerId = customerId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.transactions = transactions;
	}

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTransactions() {
		return transactions;
	}
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}
}
package com.customer;

import com.dao.*;
import com.customService.*;

public class transactions extends customer{
	private String accountNumber, transactionType, date;
	
	public transactions(String customerId, String name, String mobileNumber, String email, String transactions, String accountNumber, String transactionType, String date) {
		super(customerId, name, mobileNumber, email, transactions);
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.date = date;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
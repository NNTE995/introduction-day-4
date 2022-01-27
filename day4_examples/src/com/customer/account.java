package com.customer;

import com.dao.*;
import com.customService.*;

public class account extends customer{
	private String accountNumber, balance, customer;
	
	public account(String customerId, String name, String mobileNumber, String email, String transactions, String accountNumber, String balance, String customer) {
		super(customerId, name, mobileNumber, email, transactions);
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}
}
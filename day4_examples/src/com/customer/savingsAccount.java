package com.customer;

import com.dao.*;
import com.customService.*;

public class savingsAccount extends customer{
	private String accountType, saInterestRate;
	
	public savingsAccount(String customerId, String name, String mobileNumber, String email, String transactions, String accountType, String saInterestRate) {
		super(customerId, name, mobileNumber, email, transactions);
		this.accountType = accountType;
		this.saInterestRate = saInterestRate;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getSaInterestRate() {
		return saInterestRate;
	}
	public void setSaInterestRate(String saInterestRate) {
		this.saInterestRate = saInterestRate;
	}
}
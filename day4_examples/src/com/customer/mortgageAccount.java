package com.customer;

import com.dao.*;
import com.customService.*;

public class mortgageAccount extends customer{
	private String loan, yearlyInteres, yearsToPay, monthlyPay;

	public mortgageAccount(String customerId, String name, String mobileNumber, String email, String transactions, String loan, String yearlyInteres, String yearsToPay, String monthlyPay) {
		super(customerId, name, mobileNumber, email, transactions);
		this.loan = loan;
		this.yearlyInteres = yearlyInteres;
		this.yearsToPay = yearsToPay;
		this.monthlyPay = monthlyPay;
	}

	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	public String getYearlyInteres() {
		return yearlyInteres;
	}
	public void setYearlyInteres(String yearlyInteres) {
		this.yearlyInteres = yearlyInteres;
	}
	public String getYearsToPay() {
		return yearsToPay;
	}
	public void setYearsToPay(String yearsToPay) {
		this.yearsToPay = yearsToPay;
	}
	public String getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(String monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
}
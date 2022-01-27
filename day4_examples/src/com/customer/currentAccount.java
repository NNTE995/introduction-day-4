package com.customer;

import com.dao.*;
import com.customService.*;

public class currentAccount extends customer{
	private String cardNumber, nip, clabe;

	public currentAccount(String customerId, String name, String mobileNumber, String email, String transactions, String cardNumber, String nip, String clabe) {
		super(customerId, name, mobileNumber, email, transactions);
		this.cardNumber = cardNumber;
		this.nip = nip;
		this.clabe = clabe;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getClabe() {
		return clabe;
	}
	public void setClabe(String clabe) {
		this.clabe = clabe;
	}
	
	public void jugarPartido() {
		System.out.println("Juega un partido");
	}

	public void entrenar() {
		System.out.println("Entrena");
	}
}
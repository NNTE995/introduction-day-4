package com.dao;

import com.customer.*;
import com.customService.*;

public class User {
	private String customeId;
	private String name;
	private String mobileNumber;
    private String emailId;
    
	public User(String customeId, String name, String mobileNumber, String emailId) {
		super();
		this.customeId = customeId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public String getCustomeId() {
		return customeId;
	}
	public void setCustomeId(String customeId) {
		this.customeId = customeId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}   
}
package com.sss.bank.validation.api.pojo;

import java.io.Serializable;

public class BankResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getValid() {
		
		
		
		return valid;
	}
	
	
	/**
	 * @param valid
	 */
	public void setValid(String valid) {
		
		
		this.valid = valid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	private String valid;
	private String bankname;
	private String address;
	
	private String test;
	
	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}

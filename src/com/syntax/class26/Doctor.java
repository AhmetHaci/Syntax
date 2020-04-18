package com.syntax.class26;

public class Doctor {

	private long licenceID;
	private long phoneNumber;
	private String email;
	
	public long getLicenceID() {
		return licenceID;
	}
	public void setLicenceID(long licenceID) {
		this.licenceID=licenceID;
	}
	
	public long getPhoneNumber () {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

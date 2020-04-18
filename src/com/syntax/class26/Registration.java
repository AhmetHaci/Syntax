package com.syntax.class26;

public class Registration {
	private String userName;
	private String email;
    private String password;
	
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
		this.userName = userName;
	}}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
		this.email = email;
	}else {
		System.out.println("Please use only yahoo account");
	}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
	if  (!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
		this.password = password;
	}else {
		System.out.println("username cannot be empty and length should be more than 6 characters");
	}
	}
}

package com.syntax.class26;

public class Person {
	private String firstname;
	private String	lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	public String getFirstname(String firstname) {
		return firstname;
	}
	public String getLastname(String	lastname) {
		return lastname;
	}
	public int getBirthmonth( int birthmonth) {
		return birthmonth;
	}
	public int getBirthday( int birthday) {
		return birthday;
	}
	public int getBirthyear( int birthyear) {
		return birthyear;
	}
	public String getSsn(String ssn) {
		return ssn;
	}
	public void formatBirthday (int birthmonth,int birthday, int birthyear) {
		System.out.println(birthmonth +"/"+ birthday+"/"+birthyear);
		
	}
}

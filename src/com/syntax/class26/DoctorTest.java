package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc = new Doctor ();
		doc.setLicenceID(123456789);
		System.out.println(doc.getLicenceID());
		
		doc.setPhoneNumber(5206648695l);
		System.out.println(doc.getPhoneNumber());
		
		doc.setEmail("ahmet@gmail.com");
		System.out.println(doc.getEmail());

	}

}

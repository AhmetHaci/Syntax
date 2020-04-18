package com.syntax.class26;

public class PersonTest {

	public static void main(String[] args) {
		Person h = new Person ();
	System.out.println(h.getFirstname("John"));
	System.out.println(h.getLastname("Doe"));
	h.getBirthmonth(10);
	h.getBirthday(25);
	h.getBirthyear(1900);
	h.formatBirthday(10,25,1900);
	System.out.println(h.getSsn("123-45-6789"));

	}

}

package com.syntax.class27;

public class Instructor {
	String name;
	String lastName;
	public  Instructor(String name,String lastName ) {
		this.name=name;
		this.lastName=lastName;
	}
	public void display () {
		System.out.println("Instructor`s full name is "+name+" "+lastName);
	}
}

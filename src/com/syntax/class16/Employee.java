package com.syntax.class16;

public class Employee {

	int  eID ;
	double salary;
	static String CEO="Samir";
	String name;
	
	public static void main(String[] args) {
	
		Employee yunus=new Employee();
		yunus.eID=216;
		yunus.name="Yunus Yakut";
		yunus.salary=65000;
		
		Employee turker=new Employee();
		turker.eID=212;
		turker.name="Turker Dogruer";
		turker.salary=68000;
		
		System.out.println("First employee`s ID number is "+yunus.eID+", his ful name  is "+yunus.name+" and his salary is "+yunus.salary+" and his CEO is "+Employee.CEO);
		System.out.println();
		System.out.println("Second employee`s ID number is "+turker.eID+", his full name is "+turker.name+" and his salary is "+turker.salary+" and her CEO is "+Employee.CEO);
	}
}
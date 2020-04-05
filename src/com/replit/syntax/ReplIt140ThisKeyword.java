package com.replit.syntax;

public class ReplIt140ThisKeyword {

	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;

	ReplIt140ThisKeyword( ) {

	}

	ReplIt140ThisKeyword(String nname, String lastNames, int employeeIdd, String startDatee, int salaryy) {
		name = nname;
		lastName = lastNames;
		employeeId = employeeIdd;
		startDate = startDatee;
		salary = salaryy;

	}

	public void display() {
		System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
		this.name = name;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.salary = salary;

	}

}

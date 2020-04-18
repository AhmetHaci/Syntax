package com.syntax.class26;

public class Employee {
	// define private variables
	private String name;
	private int age;
	private double salary;

	// getters allowing them read only, set allowing them type/change access
	// define public methods to give an access to private variables
	

	public void setName(String name) {
		if (!name.isEmpty() && name.length() > 3) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
		if (age >1) {
	}}

	public int getAge() {
		return age;

	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

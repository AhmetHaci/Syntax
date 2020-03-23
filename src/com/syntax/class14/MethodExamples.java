package com.syntax.class14;

public class MethodExamples {

	// want to create a method that will be greeting a person



	void greet() {
		System.out.println("Hello Haciosmanoglu family");

	}
	void greet1 (String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		// how do I call method greet ?
		MethodExamples object1 = new MethodExamples();
		
		object1.greet();
		object1.greet1("Ahmet");
		object1.greet1("Hira");
		object1.greet1("Nilufer");
		object1.greet1("Serra");
		

	}
}

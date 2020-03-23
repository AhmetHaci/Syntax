
package com.syntax.class14;

public class ObkectAndClass {

	String name;
	int age;
	int height;
	String eyeColor;

	public void speak() {

		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + height+" inch tall");
		System.out.println("I am " + age + " years old");
		System.out.println("My eye color is " + eyeColor);

	}

	public void eat() {
		System.out.println("I like to eat kebab.");
		System.out.println("I like to eat Lahmacun.");
		System.out.println("I like to eat doner.");
	}

	public void walk() {
		System.out.println("Walking in the park.");
	}

	public void work() {
		System.out.println("I work at USPS.");
	}
}
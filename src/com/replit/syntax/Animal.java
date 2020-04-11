package com.replit.syntax;

public class Animal {
	String name;

	Animal(String name) {
		this.name = name;
		System.out.println("animals have name");
	}

	public void eat() {
		System.out.println("Animals eats");
	}

	public void sleep() {
		System.out.println("Animals sleep");
	}

}

class Cat {
	public void eat() {
		System.out.println("Cat eats");
	}
	public void sleep() {
		System.out.println("Cat sleeps a lot");
	}
}

class kitten1 extends Cat {
	public void eat(String name) {
		System.out.println(name + " eats milk");
	}

	public void sleep() {
		System.out.println("kitten1 sleeps a lot");
	}
}

class kitten2 extends Cat {
	public void eat(String name) {
		System.out.println(name + " eats snacks");
	}

	public void sleep() {
		System.out.println("kitten1 sleeps a lot");
	}
}

class kitten3 extends Cat {
	public void eat(String name) {
		System.out.println(name + " eats everything");
	}

	public void sleep() {
		System.out.println("kitten1 sleeps a lot");
	}
}

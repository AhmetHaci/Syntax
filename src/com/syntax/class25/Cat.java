package com.syntax.class25;

public class Cat extends Animal {
	public Cat(String type) {
		super(type);
	}

	public void sleep() {
		System.out.println(type + " sleeps a lot");
	}
}

class Kitten1 extends Cat {
	public Kitten1(String type) {
		super(type);

	}

	public void kitten1(String type) {
		
	}

	public void eat() {
		System.out.println(type + " eat milk");
	}
}

class Kitten2 extends Cat {
	public Kitten2(String type) {
		super(type);

	}

	public void kitten2(String type) {
		
	}

	public void eat() {
		System.out.println(type + " eat snacks");
	}
}

class Kitten3 extends Cat {
	public Kitten3(String type) {
		super(type);

	}

	public void kitten3(String type) {
	
	}

	public void eat() {
		System.out.println(type + " eat everything");
	}
}

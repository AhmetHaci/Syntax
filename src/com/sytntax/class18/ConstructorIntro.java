package com.sytntax.class18;

public class ConstructorIntro {

	// to create a Constructor: 1. name must be the same as your classname.
	// in Constructor no return type ( not even void )
	// name must be same as clas name

	ConstructorIntro() {
		System.out.println("I am a constructor");
	}

	public static void main(String[] args) {
		ConstructorIntro obj = new ConstructorIntro();
		System.out.println("code after constructor");
		obj.hello();
	}
	void hello () {
		System.out.println("Hello class");
	}

}

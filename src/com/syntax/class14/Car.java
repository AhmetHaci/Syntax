package com.syntax.class14;

public class Car {
// define feature of the car 
//class is a template/blueprint
	String make;
	String model;
	int year;
	String color;
	int fuelEffi;

//template is a class
// features/attributes/fields/variables
//actions/behaviours-methods
//if you do not have a class you cannot create an object

	
	//define behaviour - there is nox for this we can define as much as we want
	void drive() {
		System.out.println(make+" can drive");
	}

	void accelerate() {
		System.out.println(make +" can accelerate");
	}

	void makeNoise() {
		System.out.println( make+" make noise");
	}
	void stop () {
		System.out.println(make+" stops when you press break");
		
	}
}
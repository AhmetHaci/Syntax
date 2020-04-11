package com.syntax.class24;

public abstract class Vehicle { //this class is % 50 person defined.
	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehicle can stop");
	}

	public abstract void start();
	public abstract void speed();

}

abstract class Car extends Vehicle {
public void speed() {
	System.out.println("Max car speed is up to 250");
}

public abstract void breaking (); // child class has it s own abstract behavior

}

class BMW extends Car{

	@Override
	public void start() {
		System.out.println("You can start your BMW with voice recognition ");
		
	}

	@Override
	public void breaking() {
		System.out.println("When you press on break BMW slows down");
		
	}
	
}
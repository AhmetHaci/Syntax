package com.syntax.class25;



public abstract class Vehicle { //this class is % 50 person defined.
	
	String vinNumber;
	static int totalVehicles;
	Vehicle (String vinNumber) {
		this.vinNumber=vinNumber;
		totalVehicles++;
	}
	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehicle can stop");
	}
	public static void displayTotal() {
		System.out.println("Total vehicles we build ="+ totalVehicles);
	}

	public abstract void start();
	public abstract void speed();

}

abstract class Car extends Vehicle {
	String carType;
	Car (String vinNumber, String carType ){
		super( vinNumber);
      	this.carType=carType;
	}
public void speed() {
	System.out.println("Max car speed is up to 250");
}

public abstract void breaking (); // child class has it s own abstract behavior

}

class BMW extends Car{
	String make, model;

	BMW (String vinNumber, String carType, String make, String model){
		super ( vinNumber,  carType);
		this.make=make;
		this.model=model;
	}
	@Override
	public void start() {
		System.out.println("You can start your BMW with voice recognition ");
		
	}

	@Override
	public void breaking() {
		System.out.println("When you press on break BMW slows down");
		
	}
	public void display () {
		System.out.println("We build "+make+" "+ model+" with vin# "+vinNumber);
	}
}
package com.ahmet;

public class Car {
	
	//class variable
	public static int counter = 0;
	
	protected int door;
	protected String color;
	protected String make;
	protected String brand;
	protected int year;
	
	
	public void getCounter() {
		System.out.println(counter);
	}
	
	public void getColor() {
		System.out.println(this.color);
	}
	

}

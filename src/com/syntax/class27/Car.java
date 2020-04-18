package com.syntax.class27;

 class Car {
	double carPrice;
	String color;
	
	public Car (double carPrice, String color) {
		this.carPrice=carPrice;
		this.color=color;
	}
	public double calculateSalePrice() {
		return carPrice;
	}

	public void display () {
		System.out.println("Sale price of "+color+" vehicle is $"+carPrice);
	}
}
class Sedan extends Car {
	int length;

	public Sedan(double carPrice, String color,int length) {
		super(carPrice, color);
		this.length=length;
		
	}
	public double calculateSalePrice() {
		if ( length > 20) {
			carPrice=carPrice -(carPrice*0.5);
		}else {
			carPrice=carPrice -(carPrice*0.1);
			
		}
		
		return carPrice;
	}
	
}

class Truck extends Car {
	double weight;

	public Truck(double carPrice, String color,double weight) {
		super(carPrice, color);
		this.weight=weight;
	}
	public double calculateSalePrice() {
		if (weight > 2000) {
			carPrice=carPrice*0.9;
		}else {
			carPrice=carPrice*0.8;
			
		}
		return carPrice;
	}
	
	
}
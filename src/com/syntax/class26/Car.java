package com.syntax.class26;

abstract class Car {
	String color;
	double carPrice;

	Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	abstract double calculateSalePrice();

}
class Sedan extends Car {
	int length;
	Sedan ( double carPrice, String color, int length){
		super(carPrice,color);
		this.length=length;
	}
	@Override
	double calculateSalePrice() {
	 if ( length >20) {
		 carPrice-=carPrice*0.05;
	 }else {
		 carPrice-=carPrice*0.1;
	 }
		return carPrice;
	}
}
class Truck extends Car {
	double weight;
	Truck ( double carPrice, String color, double weight){
		super(carPrice,color);
		this.weight=weight;
	}
	@Override
	double calculateSalePrice() {
	 if ( weight >2000) {
		 carPrice-=carPrice*0.1;
	 }else {
		 carPrice-=carPrice*0.2;
	 }
		return carPrice;
	}
}

 
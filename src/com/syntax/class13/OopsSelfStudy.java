package com.syntax.class13;

class Car {
	String color;
	int mpg;
	int speed;
	String country;

	void speak() {
		System.out.println("my color is " + color + "  I made in " + country + " my speed is " + speed
				+ " per hour my fuel efficensy is" + mpg);
		

	}
}

public class OopsSelfStudy {

	public static void main(String[] args) {

		Car kia = new Car();
		Car Buick = new Car();
		Car Porshe = new Car();
		kia.color="Blue";
		kia.country="Japan";
		kia.mpg=28;
		kia.speed=80;
		kia.speak();
		Buick.color="Yellow";
		Buick.country="America";
		Buick.mpg=35;
		Buick.speed=120;
	}

}

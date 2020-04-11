package com.syntax.class25;



public class VehicleTest {
	public static void main(String[] args) {

BMW bmw = new BMW("45654wefgsd", "SUV","BMW","I7");
bmw.display();
		
Car car= new BMW ("8756wefgsd", "Sedan","BMW","X5");
 car.drive();
 car.stop();
 car.speed();
 car.start();
 car.breaking();
 System.out.println();
 Vehicle vehicle=new BMW("6544wefgsd", "SPORT","BMW","M5");
 //these comes from vehicle
 vehicle.drive();
 vehicle.stop();
 vehicle.speed();
 System.out.println();
 bmw.start(); // these comes from BMW
 bmw.breaking();
 bmw.display();
 //vehicle.breaking(); it will complain cuz it s in car class, won t be available for parent
 //vehicle.display(); //it will complain  it s in BMW class, not available for grandkid
	Vehicle.displayTotal();
	BMW.displayTotal();
	}
}

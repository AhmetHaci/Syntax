package com.syntax.class27;

public class CarTest {

		public static void main(String[] args) {
			Car car = new Car ( 2000, "blue");
        System.out.println(car.calculateSalePrice());	
        
        Sedan sedan = new Sedan (2000, "white",30);
        System.out.println(sedan.calculateSalePrice());
        
        Truck truck =new Truck (2000, "black", 3000);
        System.out.println(truck.calculateSalePrice());
		}
	}


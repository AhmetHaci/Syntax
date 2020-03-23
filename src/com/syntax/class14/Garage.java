package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
    //object instance /example of class/ we can create multiple samples of the class
		// build individual objects

		Car car1 = new Car();
		car1.make = "Lambo";
		car1.model = "Gallo";
		car1.year = 2019;
		car1.color = "Blue";
		car1.fuelEffi=28;

		Car car2 = new Car();
		car2.make = "Toyota";
		car2.model = "Estima";
		car2.year = 2020;
		car2.color = "Yellow";
		car2.fuelEffi=32;
		
		Car car3= new Car();
		car3.make="Honda";
		car3.model="Civic";
		car3.year=2006;
		car3.color="Grey";
		car3.fuelEffi=30;
		
		//print LAMBO
		
		System.out.println("I drive " +car1.color+" "+car1.make +" and my car year is "+ car1.year+" and it burns "+ car1.fuelEffi+" gallons per mile");
        car1.drive();
        car1.accelerate();
        car1.makeNoise();
        car1.stop();
        
        
        System.out.println();
        
        System.out.println("I drive " +car2.color+" "+car2.make +" and my car year is "+ car2.year+" and it burns "+ car2.fuelEffi+" gallons per mile");
        car2.drive();
        car2.accelerate();
        car2.makeNoise();
        car2.stop();
        
        System.out.println();
        
        System.out.println("I drive " +car3.color+" "+car3.make +" and my car year is "+ car3.year+" and it burns "+ car3.fuelEffi+" gallons per mile");
        car3.drive();
        car3.accelerate();
        car3.makeNoise();
        car3.stop();
		
		
		
		
		
	}

}

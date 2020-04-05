package com.syntax.class23;

public class CarTest {
	public static void main(String[] args) {

		Car bmw = new BMW("bmw");              //runtime polymorphism
		//bmw.GPS (); // C.E. gives error undefined method because you are on Car object not BMW
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");
		Car[] cars = { new BMW("bmw"), new Tesla("tesla"), new Mercedes("Mercedes"), new Honda("Honda") };
//		for (int i = 0; i < cars.length; i++) {
//			cars[i].start();
//		}
 for (Car c:cars) {  // with for each loop
	 c.display();
	 c.start();
	 System.out.println("==================");
 }
	}
}

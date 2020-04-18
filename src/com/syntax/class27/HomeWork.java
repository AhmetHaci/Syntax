package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		ArrayList<String> car = new ArrayList<>();
		car.add("Ford");
		car.add("Chrysler");
		car.add("GMC");
		car.add("Buick");
		System.out.println("Advance for loop");
		for (String myCar: car ) {
			System.out.print(myCar+" ");
		}
		System.out.println();
       System.out.println("Regular for loop");
		for ( int i=0;i<car.size();i++) {
			System.out.print(car.get(i)+" ");
		}
		System.out.println();
		System.out.println("Iterator loop");
		
		Iterator newCar= car.iterator();
		while (newCar.hasNext()) {
			System.out.print(newCar.next()+" ");
		}
	}

}

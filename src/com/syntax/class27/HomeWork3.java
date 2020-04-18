package com.syntax.class27;

import java.util.List;
import java.util.ArrayList;

public class HomeWork3 {

	public static void main(String[] args) {
		
		List <String> drink = new ArrayList<>();
		drink.add("Coke");
		drink.add("Coffe");
		drink.add("Milk");
		drink.add("Tea");
		
		//drink.set(0, "water");
		//System.out.println(drink);
		
		for (int i=0; i<drink.size();i++){ 
			if ( drink.get(i).contains("a") || drink.get(i).contains("e")) {
				drink.set(i, "Water");
				
				
			}
		}
System.out.println(drink);
	}

}

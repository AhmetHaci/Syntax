package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		 ArrayList <Integer>numbers=new ArrayList <>();
		 numbers.add(10); //autoboxing
		 numbers.add(20);
		 numbers.add(30);
		 numbers.add(40);
		 
		 System.out.println(numbers.get(2)); // if you wanna print just index 2
		 System.out.println(numbers.contains(10)); // this will check the array if you store this number in array
		 
		 for ( int i=0; i<numbers.size();i++) {
			Integer num=numbers.get(i); //autounboxing
			System.out.println(num);
		 }
 System.out.println("===adcance for loop ====");
	 
 for ( Integer num : numbers) {
	 System.out.println(num);
 }
 
	
	
	}

}

package com.syntax.class11;

public class StringManipulationIntro {
  
	public static void main(String[] args) {
		String name= "Ahmet is %d years old";   // %d for int %s for string %f for decimal numbers
		System.out.println(name.length()); //number of characters
		System.out.println(name.toUpperCase()); // changes to all upper case letters
		System.out.println(name.toLowerCase()); // changes to all lower case letters
		int age = 35;
		System.out.printf(name,age);
        System.out.println();
		StringBuilder ahmet = new StringBuilder ("! xatnyS ta avaJ gninrael m I dna temhA si eman yM ");//reverse character
		System.out.println(ahmet.reverse());
		int a=10; // Concatenating int to a string 
		String b=String.valueOf(a);
		System.out.println(b);
	}
	
}

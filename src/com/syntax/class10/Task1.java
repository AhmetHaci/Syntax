package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all
		// elements from the array
		String[] animal = new String[6];
		animal[0] = "Lion";
		animal[1] = "Leopar";
		animal[2] = "Monkey";
		animal[3] = "Donkey";
		animal[4] = "Eagle";
		animal[5] = "Cat";
		for (int i=0;i<animal.length;i++) {
			System.out.print(animal[i]+" ");	
	}
	
		for (String animals:animal) {
			System.out.println(animals+" ");
	}
}
}
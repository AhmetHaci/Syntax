package com.syntax.class11;



public class TaskAllinOne {
	
	public static void main(String[] args) {

		String subject="Re re re Ra ra ra Galatasaray Sampiyon";
		//Using space “ ” as a delimiter 
		//Split returns an array of Strings
		String [] splittedSub = subject.split(" ");
		System.out.println(splittedSub.length);
		//Looping through the array to get all the values
		for (int i = 0; i< splittedSub.length; i++) {
		System.out.println(splittedSub[i]);
		}
	}
}

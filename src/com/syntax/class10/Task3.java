package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values
		// from an array print capital for each country. (use 2 different loops)
	
	String [] country = {"Turkey", "Kazakhstan","Mongolia","Fas"};
	for (String countries:country) {
		if (countries.equals("Turkey")){
			System.out.println("Ankara");
		}else if (countries.contentEquals("Kazakhstan")){
			System.out.println("Astana");
		}else if (countries.contentEquals("Mongolia")){
			System.out.println("UlaanBaatar");
		}else if (countries.contentEquals("Fas")){
			System.out.println("Marekish");
		}
	}
	}
}
	
	
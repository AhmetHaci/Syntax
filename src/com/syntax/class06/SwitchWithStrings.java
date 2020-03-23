package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/*
		 * ask user where he/she from based on the country we will define fav food your
		 * favor is...............
		 */
		Scanner scan;
		String country;
		String favFood;
scan=new Scanner (System.in);
		System.out.println("Please enter your country: ");
		
		country = scan.nextLine();

		switch (country.toLowerCase()) {
		case "morocco":
			favFood = "couscous";
			break;
		case "turkey":
			favFood = "Kebab";
			break;
		case "kazakhstan":
			favFood = "Beshparmak";
			break;
		case "afghanistan":
			favFood = "Mantu";
			break;
      default:
    	  favFood="Unknow";
		}
System.out.println("Your fav food is "+ favFood);
	}

}

package com.syntax.class04;

import java.util.Scanner;

public class fromFriend {

public static void main (String []args) {
  Scanner atl=new Scanner (System.in);
  
	System.out.print("How long you are working with the company? ");
	int year = atl.nextInt();

	System.out.print("What is your Annual Salary? ");
	double salary = atl.nextDouble();

	if (year>=5) {
		System.out.println("You are eligible for Bonus!!");
		if (salary>=50000) {
			System.out.println("Your bonus amount is 5000.");
		} else {
			System.out.println("Your bonus amount is 3000.");
		}
	} else {
		System.out.println("Sorry, You are not Eligible for Bonus untill you reach 5 year.");
	}
}
}
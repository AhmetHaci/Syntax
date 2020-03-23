package com.syntax.class04;

import java.util.Scanner;

public class NestedHW1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. If you
		// user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more
		Scanner atl = new Scanner(System.in);
		      
		System.out.println("Do you have a credit card? ");
		boolean respond1=atl.nextBoolean();
				
		if (respond1) { //it can string as well like (answer.equals("Yes");
			System.out.println("What is your balance on your credit card ?");
			int respond2 = atl.nextInt();

			if (respond2 >= 1000) {
				System.out.println("You should pay your balance off immediatelly !!!");
			} else {
				System.out.println(" You can spend more money");
			}
		} else {
		System.out.println(" Would you like to apply for a credit card from us ! ");
		
			
		}

	}

}



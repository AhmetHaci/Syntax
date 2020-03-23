package com.syntax.class08;

import java.util.Scanner;

public class AselLoopsInClass {

	public static void main(String[] args) {
		// ask a user pay for a candy
		// as long as entered price is not 4 dollars machine ask keep paying
		// once amount is correct it says enjoy your candy.
         Scanner scan = new Scanner (System.in);
		
		int price;
		do {
			System.out.println("Please pay for candy ");
			price=scan.nextInt();
			
		}while(price!=2); // do loop execute first and then checks the cond
				System.out.println("You got the candy ");
			}
		
		
	}

package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		//  ask a user pay for the candy
		//as long as the entered price is not 2
		//we need keep asking for pay
		//once amount is correct ====> enjoy your candy
		
		Scanner scan =new Scanner (System.in);
		double price;
		do {
		
		System.out.println("Please pay for candy! ");
		 price=scan.nextDouble();
	
		} while (price !=2);
	
System.out.println("enjoy your candy");
	}
	}

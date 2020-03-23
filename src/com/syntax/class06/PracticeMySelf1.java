package com.syntax.class06;

import java.util.Scanner;

public class PracticeMySelf1 {

	public static void main(String[] args) {
//		Anything on sale ? 
//				if yes 
//				what is the price ? 
//				and what is the discount ? 
//				if  item 25$ - 50$ = % 10
//		if item  51$ - 175$ = % 20
//				if item 176$ - 300$ = % 30
//				if item 301$  >  % 50

		Scanner scan = new Scanner(System.in);
		String sale = null;
		double discount = 0;
		double price = 0;
		double finalPrice = 0;
		System.out.println("Anything on sale? ");
		String answer = scan.nextLine();
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price? ");
			price = scan.nextInt();
			if (price >= 25 && price < 50) {
				discount = price * 0.1;
			} else if (price >= 51 && price <= 175) {
				discount = price * 0.2;
			} else if (price >= 176 && price < 300) {
				discount = price * 0.3;
			} else if (price > 300) {
				discount = price * 0.5;
			}
			finalPrice = price - discount;
			System.out.println("Your discount is " + finalPrice);
		} else {
			System.out.println("I will not go shopping");
		}

	}

}

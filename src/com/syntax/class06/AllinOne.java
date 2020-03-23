package com.syntax.class06;

import java.util.Scanner;

public class AllinOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sale;
		double price;
		double discount;
		double finalPrice;
		System.out.println("Anything on sale ? ");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price? ");
			price = scan.nextDouble();
			if (price <= 20) {
				discount = price * 0.10;
			} else if (price > 20 && price <= 100) {
				discount = price * 0.20;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.30;
			} else {
				discount = price * 0.50;
				finalPrice = price - discount;
			}
			finalPrice = price - discount;
			System.out.println("After " + discount + " discount the price of the item reduced from " + price + " to "
					+ finalPrice);
		} else {
			System.out.println("I m not going to shopping");
		}
	}
}

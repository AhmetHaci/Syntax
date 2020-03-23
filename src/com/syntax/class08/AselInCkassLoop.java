package com.syntax.class08;

import java.util.Scanner;

public class AselInCkassLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please pay for candy ! ");
		int price = scan.nextInt();
		while (price != 2) {
			System.out.println("Please pay for candy");
			price = scan.nextInt();
		}
		System.out.println("enjoy your candy");
	}

}

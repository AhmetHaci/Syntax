package com.syntax.class05;

import java.util.Scanner;

public class Java5Hw4 {

	public static void main(String[] args) {
		// Program to find largest number among three numbers using nested if provided
		// by a user (numbers must be distinct)
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three different numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		//
		int largest=0;
		if (a >= b && a >= c) {
			largest = a;
		} else if (b >= a && b >= c) {
			largest = b;
		} else {
			largest = c;
		}
		System.out.println("The largest number is " + largest);
	}
}

package com.syntax.class05;

import java.util.Scanner;

public class Java5Hw3 {

	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if and
		// logical operators provided by a user (numbers must be distinct)
      double number=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first decimal value: ");
		double fd = scan.nextDouble();

		System.out.println("Please enter your second decimal value: ");
		double sd = scan.nextDouble();

		System.out.println("Please enter your third decimal value: ");
		double td = scan.nextDouble();

		if (fd > sd && fd > td) {
			number=fd;

		} else if (sd > fd && sd > td) {
			number=sd;
		} else if (td > fd && td > sd) {
			number=td;
			System.out.println("The largest number is "+number);
		}
	}

}

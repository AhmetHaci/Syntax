package com.replit.syntax;

import java.util.Scanner;

public class ReplIt63ForLoop {
	// Write a for loop that will print out a series of numbers starting at 0 and
	// ending at the x(value must be taken from a user), exclusive.

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int x;
		System.out.print("In:");

		int y = inp.nextInt();

		for (x = 0; x < y; x++) {
			System.out.print(x + " ");

		}

}
	}



package com.replit.syntax;

import java.util.Scanner;

public class ReplIt96StringManipulation {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String reversed = "";
		System.out.print("In:");
		String s = inp.nextLine();
		// write your code below

		for (int i = s.length() - 1; i >= 0; i--) {

			reversed = reversed + s.charAt(i);
		}
			System.out.println(reversed);

		

	}
}
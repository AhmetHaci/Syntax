package com.syntax.class06;

import java.util.Scanner;

public class SwitchHw2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your grade as A, B, C, D : ");
		char grade = scan.next().charAt(0);
		String yourNote;
		switch (grade) {
		case 'A':
			yourNote = "Excellent";
			break;
		case 'B':
			yourNote = "Good";
			break;
		case 'C':
			yourNote = "Average";
			break;
		case 'D':
			yourNote = "Bad";
			break;
			default: 
			yourNote = "Not acceptable";

		}
		System.out.println("Your grade is " + yourNote);
	}

}

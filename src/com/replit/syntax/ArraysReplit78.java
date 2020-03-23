package com.replit.syntax;

import java.util.Scanner;

public class ArraysReplit78 {

	public static void main(String[] args) {
//		Create an int array of integers with a size of 5 and input values with Scanner. 
//		Don't print prompt questions for a user.
//		Using loop print out each element of the array that should look like the output below

		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		for (int i=0;i< a.length;  i++) {
			System.out.println(a[i]*10);

		}
	}
}
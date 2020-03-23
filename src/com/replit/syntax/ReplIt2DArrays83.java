package com.replit.syntax;

public class ReplIt2DArrays83 {

	public static void main(String[] args) {
		// Write a program that calculates the sum of elements
		// from each row in a 2D array and adds them into array of integers

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};

		int total[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int row = 0;
			for (int j = 0; j < a[i].length; j++) {
				row += a[i][j];
			}
			total[i] = row;
		}

		for (int finalSum : total) {
			System.out.println(finalSum);
		}

	}
}
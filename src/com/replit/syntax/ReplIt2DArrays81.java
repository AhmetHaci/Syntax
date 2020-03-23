package com.replit.syntax;

public class ReplIt2DArrays81 {

	public static void main(String[] args) {
//		Write a program that prints the highest value in the array.
//
//		Expected Output:
//		8

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int max = a[0][0];
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] > max) {
                	max = a[j][i];
                }
            }
        }
        System.out.println(max);
	}
}
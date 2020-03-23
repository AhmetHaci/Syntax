package com.replit.syntax;

public class ReplIt71Arrays {

	public static void main(String[] args) {
		// Write a program that creates an array of integers that stores
		//the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.

                // 0   1  2    3   4   5   6   7   8 
 		int[] ali = {45,78, 12,  67, 55, 89, 23, 77, 88};

		for (int i = 0; i < ali.length; i+=2) {

			System.out.print(ali[i] + " ");
		}
    
    }
    
  }

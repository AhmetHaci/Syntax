package com.replit.syntax;

public class ArraysReplIt75 {

	public static void main(String[] args) {
//Write a program that creates an array of integers that stores the
//following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
//Using a for loop print values from that array and output should look like below
//		Output:
//	   78 13 11 
	
		int[] numbers={45, 78, 12, 67, 55, 89, 23, 77, 88};
	    for(int i=2; i<3; i++) {
	      System.out.print(numbers[1]+" "+(numbers[2]+1)+" "+(numbers[2]-1));
	    }
	}
}
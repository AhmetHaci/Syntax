package com.syntax.class08;

public class ForLoopTaskInClass {

	public static void main(String[] args) {
		// write a program to calculate sum of and sum of even numbers 1 to 99
		
		
		int sumOdd=0;
		int sumEven=0;
		for (int i=1;i<=99;i++) {
		if (i%2==1) {	
			sumOdd=sumOdd+i; 
		}else {
			sumEven=sumEven+i;
	}
		}
		System.out.println("Sum of even numbers "+sumEven);
		System.out.println("Sum of odd number "+ sumOdd);
		}
}


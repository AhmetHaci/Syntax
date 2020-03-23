package com.syntax.class08;

public class InClassForLoopTask {

	public static void main(String[] args) {
		// calculate sum of odds and evens from 1 to 99

		int sumEven = 0;
		int sumOdd=0;
		

		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 0) {
           sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
	System.out.println("Sum of even "+sumEven);
	System.out.println("Sum of odd "+sumOdd);
	}
}
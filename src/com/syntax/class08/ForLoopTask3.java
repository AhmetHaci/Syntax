package com.syntax.class08;

import java.util.Scanner;

public class ForLoopTask3 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers
		// (start and end point), provided by a user and then from that range
		// prints the sum of the even and odd integers.

		Scanner scan = new Scanner(System.in);
		int sumEven = 0;
		int sumOdd = 0;
		System.out.println(" please enter two integer numbers");
		int fnum = scan.nextInt();
		int snum = scan.nextInt();
		for (int i = fnum; i <= snum; i++) {
			if (fnum % 2 == 0) {
				sumEven = sumEven + i;
				
			}else {
					sumOdd = sumOdd + i;
					
				}
			}
		System.out.println("The total of even numbers between " + fnum+ " to " +snum +" equals "+sumEven);
		System.out.println("The total of odd numbers between " + fnum+ " to "+snum+ " equals "+sumOdd);
		}
	}


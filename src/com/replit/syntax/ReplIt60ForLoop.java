package com.replit.syntax;

public class ReplIt60ForLoop {

	public static void main(String[] args) {
// Write a program that prints the count down from 10 up to 1 and then says "Happy New Year!".

		for (int i = 10; i >= 0; i--) {
			if (i == 0) {

				break;
			}

			System.out.println(i);
		}
		System.out.println("Happy New Year!");
	}

}

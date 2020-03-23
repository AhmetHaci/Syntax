package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		int number = 85;
		String result = null;
		if (number >= 0 && number <= 10) {
			System.out.println("This is number is small");
		}
		else if (number >= 11 && number <= 100) {
			System.out.println("This number is big");
		}
		else if (number >= 101 && number <= 1000) {
			System.out.println("This number is larger");
			
		}else {
			System.out.println("This number is super larger");
		}
	}
}

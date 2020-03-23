package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {

		int day = 1;
		day=4;//updated

		if (day == 2 || day == 3) {
			System.out.println("SDLC Class");
		}
		else if (day == 6 || day == 7) {
			System.out.println("Java class");
		}
		else if (day == 4) {
			System.out.println("Review class");
		}
		else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else {
			System.out.println("Invalid entry");
		}

	}

}

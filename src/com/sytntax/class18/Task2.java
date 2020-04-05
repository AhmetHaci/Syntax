package com.sytntax.class18;

import java.util.Scanner;
public class Task2 {
	static String name;
	static int grade1, grade2, grade3;
	Task2(String s1, int a, int b, int c) {
		name = s1;
		a = grade1;
		b = grade2;
		c = grade3;
	}
	void displayMessage() {
		System.out.println("Dear " + name + 
				" according to last three scores your average is "
				+ (grade1 + grade2 + grade3) / 3);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your name:");
		name = input.nextLine();
		System.out.println("first score:");
		grade1 = input.nextInt();
		System.out.println("second score:");
		grade2 = input.nextInt();
		System.out.println("third score:");
		grade3 = input.nextInt();
		Task2 obj = new Task2(name, grade1, grade2, grade3);
		obj.displayMessage();
	}
}
package com.replit.syntax;

import java.util.Scanner;

public class ReplIt37LogicalOperators {

	public static void main(String[] args) {
//		Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need ___ "

		String drink;
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty ? ");
		boolean thirsty = scan.nextBoolean();
		System.out.println("Are you sleepy ? ");
		boolean sleepy = scan.nextBoolean();

		if (thirsty && !sleepy) {
			drink = "drink water";

		} else if (thirsty && sleepy) {
			drink = "drink coffee";
		} else if (!thirsty && sleepy) {
			drink = "drink tea";

		} else {
			drink = "drink Nothing";
		}
		System.out.println("Looks like you need to " + drink);
	}
}

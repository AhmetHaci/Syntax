package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.

		Scanner scan = new Scanner(System.in);
		String country;
		String lang;
		System.out.println("Where are you from? ");
		country = scan.nextLine();

		switch (country) {
		case "Turkey":
			lang = "Turkish";
			break;
		case "USA":
			lang = "English";
			break;
		case "Japan":
			lang = "Japanese";
			break;
		case "France":
			lang = "French";
			break;
		default:
			lang = "Invalid";
		}
			System.out.println("You speak " + lang);
		}

	}



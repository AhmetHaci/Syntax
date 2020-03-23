package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//		Prompt the user to enter person heights in inches. Person should be classified as one of the following:
//			short (under 60 inch)
//			medium(between 60 -72 inch)
//			tall (over 72 inch)
//
		Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your height: ");
	double height=scan.nextDouble();
	
	if (height<=5.5) {
		System.out.println("You are short");
	}else if ((height >=5.5) && (height <=5.9)){
		System.out.println("You are average ");
	}else if (height >=5.9) {
		System.out.println("You are tall");
	}else {
		System.out.println("invalid entry");
	}
		
	}

}

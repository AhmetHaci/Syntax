package com.syntax.class05;

import java.util.Scanner;

public class JavaHW3 {

	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if and
				// logical operators provided by a user (numbers must be distinct)
		
		Scanner scan=new Scanner (System.in);
		int result;
		System.out.println("Please enter number:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				result=num1;
				
			}else {
				result=num3;
			}
		}else {
			if (num2>num3){
				result=num2;
			}else {
				result=num3;
			}
			System.out.println("Largest number is "+ result);
		}
		
	}

}

package com.replit.syntax;

import java.util.Scanner;

public class ReplIt34NestedIfScanner {

	public static void main(String[] args) {
//		Write a program to find the largest number among three distinct numbers using nested if condition
//		Please use Scanner class to take input from users
//
//		Expected Output:
//		Please enter 3 distinct numbers
//		The largest number is 14

	Scanner scan=new Scanner (System.in);
	
	System.out.println("Please enter 3 distinct numbers ");
	int fnum=scan.nextInt();
	int snum=scan.nextInt();
	int tnum=scan.nextInt();
	
	int result=0;
	
	if (fnum > snum && fnum>tnum) {
		result=fnum;
	}else if (snum>fnum && snum>tnum) {
		result=snum;
	}else {
		result=tnum;
	
	
	}
	System.out.println(" The largest number is "+ result);
	
	
	}

}

package com.replit.syntax;

import java.util.Scanner;

public class ReplIt92StringManipulation {

	public static void main(String[] args) {
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

        Scanner scan=new Scanner (System.in);
		System.out.println("IN");
		String in=scan.nextLine();
		
		String newIn=in.substring(0, 3);
		
		System.out.println("The first 3 letters of "+ in +" is "+newIn);
		
	}

}

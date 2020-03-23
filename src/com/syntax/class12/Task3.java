package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names and if they expecting boy or girl?
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL
		
	
	
	Scanner scan=new Scanner (System.in);
	
	String boy;
	String girl;
	
	System.out.println("Please enter your mom and dad`s name:  ");
	String mom=scan.nextLine();
	String dad=scan.nextLine();
	
	System.out.println("What you are expecting? ");
	String gender=scan.nextLine();
	
	if (gender.equalsIgnoreCase("Girl")) {
		System.out.println(mom.substring(0, mom.length()/2) + dad.substring(0,dad.length()/2));
	}else if(gender.equalsIgnoreCase("Boy")) { 
		System.out.println(dad.substring(0, dad.length()/2) + mom.substring(0,mom.length()/2));
	}else {
		System.out.println("invalid gender");
	}
	
	
	
	
	
	}
}



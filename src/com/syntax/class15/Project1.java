package com.syntax.class15;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
//		Create a method createEmail(). 
//		Based on provided users name, lastName and email type, your method should return complete email Address.
//				Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	
		
	Email ();
	}

	private static void Email() {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter you first name: ");
		String fname=scan.nextLine();
		System.out.println("Please enter you last name: ");
		String lname=scan.nextLine();
		
		String fullName=fname.concat(lname);
		
		System.out.println("Please choose your e-mail tail: @hotmail.com, @yahoo.com ");
				String tail=scan.nextLine();
		
 System.out.println(fullName.concat(tail));

			        }


	    }    
		
	


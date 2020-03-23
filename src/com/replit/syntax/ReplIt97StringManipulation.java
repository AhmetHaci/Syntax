package com.replit.syntax;

import java.util.Scanner;

public class ReplIt97StringManipulation {

	public static void main(String[] args) {
//		Write code that will take in a String input and check to see if it is a palindrome or not.
//
//		A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
//
//		Examples of palindromes:
//		racecar
//		was it a car or a cat I saw
//		never odd or even
//		rats live on no evil star
//
//		Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
//
//		Your program will print out "true" if it's a palindrome and "false" if not.
		   Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();

			String strLow=givenString.toLowerCase().replaceAll("[^A-Za-z0-9]","");
			char reverse1='a';
			char mainstr='c';
			for( int i=strLow.length()-1; i>=0; i--) {
				reverse1=strLow.charAt(i);
			}for(int i1=0; i1<strLow.length(); i1++) {
				mainstr=strLow.charAt(i1);
			}if( mainstr==reverse1) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			//Was it Eliot's toilet I saw?

	      
	   }  
	}  
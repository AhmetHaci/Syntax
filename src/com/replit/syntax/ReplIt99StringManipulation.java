package com.replit.syntax;

import java.util.Scanner;

public class ReplIt99StringManipulation {

	public static void main(String[] args) {
//		Inputs:
//			String word;
//
//			Write a for loop that will loop through every character of a word and print out each character, each on a separate line 
//
//			 Sample inputs/outputs:
//			In: hello
//			h
//			e
//			l
//			l
//			o

			    Scanner inp = new Scanner(System.in);
			    System.out.print("In:");
			    String word = inp.nextLine();
			    //write your code below
			  
			    for (int i=0;i<word.length();i++) {
			    	
			    	System.out.println(word.charAt(i));
			    				    }
		
	}
	
			}
	




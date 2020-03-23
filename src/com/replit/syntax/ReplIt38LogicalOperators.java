package com.replit.syntax;

import java.util.Scanner;

public class ReplIt38LogicalOperators {

	public static void main(String[] args) {
//		For you to do:
//			Prompt user with a question: "Is it weekend?"
//			If it is not a weekend --> subject="Manual testing"
//			Otherwise --> subject="Java"
//
//			Output: 
//			"Today you will be learning ____"

	boolean subject;
	Scanner scan=new Scanner (System.in);
	
	System.out.println(" Is it weekend? ");
    boolean input=scan.nextBoolean();
    
    if (input){
    System.out.println("Today you will be learning Java");
    }else {
    	System.out.println("Today you will be learning Manual testing");
    }
	
	}

}

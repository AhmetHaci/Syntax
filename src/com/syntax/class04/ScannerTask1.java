package com.syntax.class04;
import java.util.Scanner;
public class ScannerTask1 {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less than 200,000 then you would lend the money otherwise you would reject the client.

	Scanner atl=new Scanner (System.in);
	
	System.out.println("How much you need to loan? ");
	
	int loan=atl.nextInt();
	System.out.println(loan + "dollars ");
	
	if (loan <200000) {
		System.out.println("I will loan you some money");
	}else {
		System.out.println("You cannot get a loan");
	}
	
	
	
	
	}

}

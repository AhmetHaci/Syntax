package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		
//capture values
	Scanner scan=new Scanner (System.in);
	System.out.println("how old are you?");
	int age=scan.nextInt();
	
	//if you use || it will take one of the condition and if cond true it will execute
	if ((age > 0) && (age <=3)){
		System.out.println("You are a baby");
	}else if ( (age >=4 ) && (age <=5)) {
		System.out.println("You are a kid");
	}else if ( (age>=6) && (age<=12)){
		System.out.println("You are a child");
	}else if ((age >=13) && (age <=19)){
		System.out.println("You are a teenager");
	}else if((age >=20) && (age<=64)) {
	System.out.println("You are an adult");
	}else if (age>=65) {
		System.out.println("You senior citizen");
	}else {
		System.out.println("Please enter a valid age");scan.close();
	}
	
	}
}


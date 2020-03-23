package com.syntax.class08;

import java.util.Scanner;

public class AselTask1 {

	public static void main(String[] args) {
//2 numbers from user, find even and odd numbers between those two numbers
	Scanner scan=new Scanner (System.in);
	
	int sumEven=0 ;
	int sumOdd=0;
	System.out.println("Please enter two numbers:");
	int min=scan.nextInt();
	int max=scan.nextInt();
	
	for(int i=min;i<=max;i++) {
		if(i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i;
		}
		
	}
	System.out.println(" The total of even numbers from "+min+" to"+max+" is "+sumEven);
	System.out.println(" The total of odd numbers from "+min+" to"+max+" is "+sumOdd);
	}
}
package com.syntax.class06;

import java.util.Scanner;

public class SwitchHw3 {

	public static void main(String[] args) {
		// Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.

	Scanner scan=new Scanner (System.in);
	int result=0;
	System.out.println("Please enter two random numbers: ");
	int fnum=scan.nextInt();
	int snum=scan.nextInt();
	
	System.out.println("Please enter your operator: +, - ,  * , / " );
    char operator=scan.next().charAt(0);
    
    switch (operator) {
    case '+':
    	result=fnum+snum;
    	break;
    case '-':
    	result=fnum-snum;
    	break;
    case'*':
    	result=fnum*snum;
    	break;
    case '/':
    	result=fnum/snum;
    	break;
    	default:
    		System.out.println("You have entered wrong operator ");
    return;
    }
    System.out.println(fnum + " "+ operator+" "+ snum+" "+ result);
	}
}



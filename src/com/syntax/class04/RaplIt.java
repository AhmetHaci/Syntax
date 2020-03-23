package com.syntax.class04;
import java.util.Scanner;
public class RaplIt {

	public static void main(String[] args) {
		Scanner atl=new Scanner (System.in);
		
	/*Ask the user to enter any number
		if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
		If the number if even then check if it is greater than 1000 or not.
		If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
		*/
	
	System.out.println("Enter any number: ");
	int number=atl.nextInt();
	
	if (number%2==0) {
		System.out.println("Value is even");
	if(number>1000) {
		System.out.println("Even value is large");
	}else
		System.out.println("Even value is just right");
		}
		
	else {
	
	
		System.out.println("Value is odd");
}
}
}
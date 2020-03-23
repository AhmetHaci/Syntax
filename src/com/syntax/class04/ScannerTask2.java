package com.syntax.class04;
import java.util.Scanner;
public class ScannerTask2 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
	
	 Scanner atl=new Scanner (System.in);
	 
	 System.out.println("How old are you? ");
	 int age = atl.nextInt();
	 
	 System.out.println("your age is "+ age);
	 
	 if (age>18) {
		 System.out.println(" Yo can get driver licence ");
	 }else {
		 System.out.println("You are not old enough to get driver licence");
	 }
	}

}

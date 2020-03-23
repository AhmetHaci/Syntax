package com.syntax.class04;
import java.util.Scanner;
public class NestedHW2 {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
  Scanner atl=new Scanner (System.in);
  
   System.out.println(" Please enter the number of years you worked with us. ");
   int year=atl.nextInt();	
  
   if (year >=5) {
		System.out.println("You are eligible for bonus");
		System.out.println("Please enter your annual salary.");
		int salary=atl.nextInt();
   	 	
     if( salary>50000) {
    	 System.out.println("You have a bonus of 5000$");
     }if (salary<50000) {
    	 System.out.println("You have a bonus of $3000");
   
     }
    	 
     }else {
    	 System.out.println("You are not eligible for bonus");atl.close();
     }
	}
}




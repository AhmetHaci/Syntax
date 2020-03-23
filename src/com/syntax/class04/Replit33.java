package com.syntax.class04;
import java.util.Scanner;
public class Replit33 {

	public static void main(String[] args) {
		/* Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		*/
		
		Scanner atl=new Scanner (System.in);
      System.out.println("Please enter the number of the years you worked with us: ");
      int year=atl.nextInt();
      
            
      if (year>5) {
    	  System.out.println("eligible for bonus");
    	  
    	  System.out.println("Enter your salary");
    	  int salary=atl.nextInt();
    	  
    	  if (salary>50000) {
    		  System.out.println("your bonus $5000");
    	  }else {
    		  System.out.println("your bonus $3000");
    	  }
     
      }else {
   	  System.out.println("ineligible of bonus");
   	  
	
	}
}
}
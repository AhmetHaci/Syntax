package com.syntax.class04;
import java.util.Scanner;
public class replitCheck {

	
	 
	  public static void main ( String [] args){
	    
		  Scanner atl=new Scanner (System.in);
		  
		  System.out.println("Please enter a number");
		  int num=atl.nextInt();
		  
		  if (num>0){
		    System.out.println( num+" is positive");
		    
		  }else if ( num<0){
		    System.out.println(num+" is negative");
		    
		  }else{
		    System.out.println(" Entered number is equals to 0");
		  }
		  	 
		}
		}
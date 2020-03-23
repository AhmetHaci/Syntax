package com.replit.syntax;

import java.util.Scanner;

public class ReplIt64ForLoop {

	public static void main(String[] args) {
//		Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled
//      value of end(value must be taken from a user), exclusive.
//		Each number should be on the same line, separated by a space. 
 
			
		 Scanner inp = new Scanner(System.in);
		    System.out.print("Int:");
		    int end = inp.nextInt();
		    
		    if(end>0) {
		      for(int i=0;i<end*2;i++){
		          System.out.print(i+ " ");
		      }
		    }
		  }
		} 
	     
		   
	   


package com.syntax.class04;
import java.util.Scanner;
public class ScannerInClassExerc {

	public static void main(String[] args) {
    Scanner atl=new Scanner (System.in);
   
		
		System.out.println("Enter your first number: ");
        int num1=atl.nextInt();
        
        System.out.println( " your first number is :"+ num1 );
        
        
        System.out.println("Please enter your second number: ");
        int num2=atl.nextInt();
        
        System.out.println("Your second number " +num2);
        
        if(num1 >num2) {
        	System.out.println( num1+ " is larger than "+ num2);
        }else if (num1==num2){
        	System.out.println(num1+ " is equal "+ num2);
        }else {
        	System.out.println(num2+ " is larger than "+ num1);
        }
          

	}

}

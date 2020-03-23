package com.syntax.class03;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
Scanner atl=new Scanner(System.in);
        
        int atm=atl.nextInt();
        
        int number=1000;
     switch (number) {
     
     case 1:
    	 System.out.println("one");
    	 
    	break; 
    	
     case 2 :
    	 System.out.println("two");
    	 break;
     case 3 :
    	 System.out.println("three");
    	 break;
     case 4 :
    	 System.out.println("four");
    	 break;
    	 
    	 default:
    		 System.out.println("invalid entry");
     }
    }

}

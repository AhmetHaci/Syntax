package com.syntax.class11;

import java.util.Scanner;

public class AlphabeticOrder {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
	
		System.out.println("Please enter your  first favourite  band name: ");
        String band1=scan.nextLine();
        
        System.out.println("Please enter your  second  favourite  band name: ");
        String band2=scan.nextLine();
        
        if ( band1.compareTo(band2)<0) {
        	System.out.println( "Your favourite band name in alphabetic order is : "+band1+" ,"+band2  );
        }else {
        	System.out.println("Your favourite band name in alphabetic order is : "+band2+" ,"+band1);
        }
	}
}

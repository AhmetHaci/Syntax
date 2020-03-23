package com.syntax.class03;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner atl= new Scanner(System.in);
System.out.println("Please enter your name");
 String name=atl.nextLine();

System.out.println("Please enter your lastname");
String lastname=atl.nextLine();
	
	
	System.out.println( name +" " + lastname);
	}

	
}

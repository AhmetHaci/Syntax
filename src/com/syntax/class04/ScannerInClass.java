package com.syntax.class04;
import java.util.Scanner;
public class ScannerInClass {

	public static void main(String[] args) {
		Scanner atl=new Scanner (System.in);
		
		System.out.println("Please enter your name");
		
		String name=atl.nextLine();
		System.out.println("Your name is "+ name);
		
		System.out.println("Please enter your lastname");
		
		String lastName=atl.nextLine();
		System.out.println("Your last name is "+ lastName);
		

	}

}

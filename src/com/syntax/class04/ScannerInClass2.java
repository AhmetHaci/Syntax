package com.syntax.class04;
import java.util.Scanner;
public class ScannerInClass2 {

	public static void main(String[] args) {
		Scanner atl=new Scanner (System.in);
		
		System.out.println("Please enter your username: ");
		String userName=atl.nextLine();
		
		System.out.println("Your username is "+ userName);
		
		System.out.println("Please enter your password: ");
		int passWord=atl.nextInt();
		System.out.println("your password is "+ passWord);
		

	}

}

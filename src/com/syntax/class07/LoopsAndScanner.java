package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// we want to ask user s name and print good afternoon
//
//		Scanner scan = new Scanner(System.in);
//		int num = 1;
//
//		while (num <= 3) {
//		System.out.println("What is your name ? ");
//		 String name = scan.nextLine();
//	
//			System.out.println("Good afternoon " + name);
//			num++;
//		}
		
		//ozlem abla
//	Scanner scan=new Scanner (System.in);
//  int lnum;
//	 do {
//		 System.out.println("Enter any number between 1 to 20 ");
//		 lnum=scan.nextInt();
//		 
//	 }while  ( lnum!=17);
//	 System.out.println("Congratulations");
//	
// }
//}
		//Eliza
	
//Asel user needs to guess lucky number 1 to 20 
//if you know how many times user will guess it will be for loop , if you do not know how many times that s do loop
//		
		int luckyNum=17;
		int num;
//		while (num<=20)
		Scanner scan=new Scanner (System.in);
		
		do {
			System.out.println("Enter any number from 1 to 20: ");
			num=scan.nextInt();
			
			if (num>20 && num<1 ) {
				System.out.println("your number is out of my numbers");
			}
		}while (num!=luckyNum);
			
		System.out.println("You are the lucky person");
		}
	}


package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		// we want to ask user name and print good afternoon
		
		Scanner scan=new Scanner (System.in);
		int num=1;
		while (num<=5) {
		System.out.println("What is your name ?");
		String name=scan.nextLine();
		
		
			System.out.println("Good afternoon " +name);
			num++;
		}
	}
	}



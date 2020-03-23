package com.replit.syntax;

import java.util.Scanner;

public class ReplIt30Logical {

	public static void main(String[] args) {
		Scanner atl=new Scanner (System.in);
		
		System.out.println("Please enter two strings Please enter two numbers:");
		String ftext=atl.nextLine();
		String stext=atl.nextLine();
		int fnum=atl.nextInt();
		int snum=atl.nextInt();
		
		if ( stext.equals(ftext) && fnum==snum) {
			System.out.println("AND");
			
		}else if(fnum==snum || ftext.equals(stext) ) {
			System.out.println("OR");
		}else if(fnum!=snum && !(ftext.equals(stext))) {
			System.out.println("NONE");
		
	}
	}
		

	}



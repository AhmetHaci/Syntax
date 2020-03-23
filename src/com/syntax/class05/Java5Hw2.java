package com.syntax.class05;

import java.util.Scanner;

public class Java5Hw2 {

	public static void main(String[] args) {
//		Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August → season =“Summer”.
//		At the end of the program we should see output as “You were born ______“.


	Scanner scan=new Scanner (System.in);
	System.out.println("What is your birth month? ");
	String m=scan.nextLine();
	String season="Unknown"; // you can live it blank, or put null; when you live empty you hsould define on ln 27
	
	if (m.equalsIgnoreCase ("December") || m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February"))  
		season="Winter";
	else if (m.equalsIgnoreCase("March") || m.equalsIgnoreCase("April")|| m.equalsIgnoreCase("May"))
		season="Spring";
	else if(m.equalsIgnoreCase("june") || m.equalsIgnoreCase("July")|| m.equalsIgnoreCase("August"))
	season="Summer";
	else if(m.equalsIgnoreCase("September") || m.equalsIgnoreCase("October")|| m.equalsIgnoreCase("November"))
		season="Fall";
	else {
		season="Unknown";
		
	System.out.println("You were born in "+ season);

	}
	}
}


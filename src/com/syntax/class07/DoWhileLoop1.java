package com.syntax.class07;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		boolean workDay=true;
		int day =1;
		
		do {
			System.out.println("I need a day off");
                    day++;
		}while (day<=6) ;
			System.out.println("I do not need a day off");
			workDay=false;
		}

	
	}



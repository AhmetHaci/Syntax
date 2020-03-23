package com.syntax.class07;

public class BooleanTask {

	public static void main(String[] args) {
	 boolean workDay=true;
	 int day=1;
	  
	 //while(day<=6) {
		while (workDay) {
			if (day<6) {
		 System.out.println("I need a day off"+day);
	 }else { //}while (day>=7) 
		 System.out.println("I do not need a day off"); //Sop"I do not need a day off";
		workDay=false;
		 
	 }
		day++;
	}
}
}
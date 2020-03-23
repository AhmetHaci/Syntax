package com.syntax.class05;



public class LogicalOperString {

	public static void main(String[] args) {
		
		String day="Wednesday";
		if (day.equals("Tuesday") ||day.equals("Wednesday")) {
			System.out.println("Today is SDLC class");
		}else if(day.contentEquals("Saturday")|| day.equals("Sunday")){
			System.out.println("Today is Java class");
		}else if (day.contentEquals("Thursday")) {
			System.out.println("Today is review class");
		}else if (day.equals("Monday")|| day.equals("Friday")) {
		System.out.println("Today is no clas, it s a off day");
	}else {
		System.out.println("Invalid entry");
	}
	}
}

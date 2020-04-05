package com.syntax.class17;

public class Main {

	static String thirdLetter(String patates) {
		 String thirdLetter="";
		 for(int i=0;i<patates.length();i+=3) {
			 thirdLetter= thirdLetter+patates.charAt(i);
		 }
return thirdLetter;
	 }	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
}







package com.replit.syntax;

public class ReplIt126StaticKeyWord {


	static String thirdLetter(String text) {
		 String thirdLetter="";
		 for(int i=0;i<text.length();i+=3) {
			 thirdLetter= thirdLetter+text.charAt(i);
		 }
return thirdLetter;
	 }	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
}

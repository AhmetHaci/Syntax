package com.replit.syntax;

public class ReplIt129StaticKeyWord {
//
//	static String surround (String s, String search_term) {
//		String result="";
//		String [] ahmet=s.split("");
//		for ( int i=0;i>ahmet.length;i++) {
//			String y="("+ahmet[i]+")";
//		if (ahmet [i].equals(search_term)) {
//			ahmet[i]=y;
//		}
//		
//		result=result+ahmet[i];
//	
//		
		
		
		
		
		
		
		
		
		static String surround (String s, String search_term) {
			 String newOne =s.replaceAll(search_term, "("+search_term+")");
			return newOne; 
		 }
		public static void main(String[] args){
			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
		
	}
}

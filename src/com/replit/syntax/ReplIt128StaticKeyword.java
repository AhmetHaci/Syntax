package com.replit.syntax;

public class ReplIt128StaticKeyword {

		static int  countVowels(String s)
		{
			String count = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
			return count.length();
		}
//		static int countVowels(String s){
//		int sum=0;
//		  for(int i= 0;i<s.length();i++ ){
//		    if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ){
//		      sum++;
//		    }
	//
//		  }
//			return sum;
//		}
	//	
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countVowels("obama")); //3
			System.out.println(countVowels("happ friday! i love weekends")); //6
		}
	}
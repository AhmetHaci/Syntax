package com.replit.syntax;

public class ReplIt127StaticKeyWord {

	static int countA(String s){
	int sum=0;
	  for(int i= 0;i<s.length();i++ ){
	    if(s.charAt(i) == 'A'){
	      sum++;
	    }
	    if(s.charAt(i) == 'a'){
	      sum++;
	    }
	  }
		return sum;
	}
//static int countA (String s)	{
//		int count=0;
//		String [] ahmet=s.split("");
//		for (int i=0;i<ahmet.length;i++) {
//			if (ahmet[i].equalsIgnoreCase("a")) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}
}
package com.syntax.class15;

public class HW1 {

	public static void main(String[] args) {
		 largets(19,18);
		 evenORodd (17);
	     palindrome("hannah");
		  
	  
		
		 

	}

	private static void palindrome(String word) {
		String reverse="";
	
		int length=word.length();
		for (int i=length-1;i>=0;i--) {
			 reverse = reverse + word.charAt(i);
		}
			if (word.equals(reverse)) {
				System.out.println("Given word is palindrome");
			}else {
				System.out.println("Given word is not palindrome");
			}
		}
	

	private static void evenORodd(int num1) {
		if (num1%2==0) {
			System.out.println("Your number "+num1+" is an even number.");
		}else {
			System.out.println("Your number "+num1+" is an odd number.");
		}
		
	}

	private static void largets(int num1, int num2) {
		if (num1>num2) {
			System.out.println("Between number "+num1+" and number "+num2+" number "+num1+" is the largest");
		}else {
			System.out.println("Between "+num1+" and number "+num2+" number "+num2+" is the largest");
		}
		
		
	}

}

package com.syntax.class11;

public class StringToInt {

	public static void main(String[] args) {
		String S1 ="The number is: "+ "123"+"456"; 
		 System.out.println(S1); 
		 //then it will print: The number is: 123456 
		 
		 //If the initialization is like this: 
		 String S2 = "The number is: "+(123+456); 
		 System.out.println(S2); 

	}

}

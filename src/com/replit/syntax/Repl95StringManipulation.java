package com.replit.syntax;

public class Repl95StringManipulation {

	public static void main(String[] args) {
//		Create a String given="Hello Syntax friends". 
//				Using String methods from given String create new String "Welcome Syntax family"
//
//				Expected Output:
//				Welcome Syntax family
		
		String given="Hello Syntax friends";
		String newgiven=given.replace("friends", "family");
		String lastgiven=newgiven.replace("Hello", "Welcome");
		System.out.println(lastgiven);
		
		

	}

}

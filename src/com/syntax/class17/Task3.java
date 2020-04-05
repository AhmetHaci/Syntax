package com.syntax.class17;

public class Task3 {
//	        Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
//			Method should be available inside the class where it was declared and executed by calling it is name

	private String gulbahar(String Ayse) {
		String vowels = "";
		if (Ayse.contains("a") || Ayse.contains("e") || Ayse.contains("i") || Ayse.contains("o")|| Ayse.contains("u")) {
			
		}
		return vowels;
		// A, E, I, O, U,
	}

	public static void main(String[] args) {
    Task3 obj=new Task3();
   
    System.out.println(obj.gulbahar("merhaba hayat"));
	}
}





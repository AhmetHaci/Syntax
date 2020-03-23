package com.syntax.class12;

public class StringManipulation {

	public static void main(String[] args) {
		String str= "Good Morning Students! ";
		
		char letter1=str.charAt(0);
		System.out.println(letter1);

	char letter5=str.charAt(4);		
	System.out.println("Letter at index 4 is "+letter5+".");
	//char someLetter=str.charAt(55); will give error
	//System.out.println(someLetter);
	//get all char one by one from a string
char letters;
	for (int i=0;i<str.length();i++) {
		letters=str.charAt(i);
		System.out.print(letters+" "); //we can also concatenate
	}
		System.out.println("index of function*******");
		String name="Syntax technologies"; /// find the number of the char
		int index=name.indexOf("syntax");//if you put out of range it wil give -1
		System.out.println(index);
	
      index= name.lastIndexOf("o");
        System.out.println("last Index of second o=" + index);
	
       
	}

}

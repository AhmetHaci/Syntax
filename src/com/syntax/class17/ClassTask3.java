package com.syntax.class17;

//Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
//		Method should be available inside the class where it was declared and executed by calling it is name.


public class ClassTask3 {
	
	
private  String WithVowel(String str) {
	str=str.replaceAll("[a-zA-Z&&[^aeiouAEIOU]]","");
return str;
}
public static void main(String[] args) {
	ClassTask3 obj=new ClassTask3();
System.out.println(obj.WithVowel("merhaba arkadaslar   "));
}
}
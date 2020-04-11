package com.syntax.class23;

public class FinalKeyword {
	
	public static String str="Hello";
	public final static String str1="Bye"; //Final variable
	final String APPLICATION_URL="syntaxtech.com";
	//final String applicationURl; eger isim vermezsen hata verir, must initialize
	final char GRADE='A';
	
public static void main(String[] args) {
	
	str="Hi";
	//str1="Good bye"; C.E. final cannot be reassigned
	//final String applicationURl="google.com"; // you cannot reassign
}
	public final void hello () {
		System.out.println("I am a final method");
	}
	public final void hello (String name) {
		System.out.println("I am overloaded final method");
	}
}
class subClass extends FinalKeyword{
//	public void hello () {    // this method up there finaled, we cannot override
//		System.out.println("I am a final method");
//	}
	
	public void hello (int num) {
		System.out.println("Hello of child class");
	}
}

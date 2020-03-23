package com.syntax.class11;

public class Equals {

	public static void main(String[] args) {
		String a= new String ("Hello");
		String b= new String ("Hello");
	if (a.contentEquals(b)) {
		System.out.println("They are equals");
	}else {
		System.out.println("They are not equals");
	}
	
	
	String x="Hello";
	String y="Hello";
	
	if (x!=y) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	}

}

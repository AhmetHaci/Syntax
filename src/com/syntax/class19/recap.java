package com.syntax.class19;

public class recap {
	recap (){
		System.out.println("Cons with no args");
	}
	recap( int num){
		System.out.println("cons with 1 para");
	}

	public static void main(String[] args) {
		recap obj = new recap (2);
		
	}
}

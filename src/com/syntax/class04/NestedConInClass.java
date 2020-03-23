package com.syntax.class04;

public class NestedConInClass {

	public static void main(String[] args) {
		
		boolean classToday=true;
		boolean flag=false;
		
		if (flag) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello Friends");
			
			}else { 
				System.out.println("Hello family");
		}
	}else {
		System.out.println("Bye");
	}
	System.out.println("I m outside of if cond");
	}
}

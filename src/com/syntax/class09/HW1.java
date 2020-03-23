package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
//Create an array of chars 
//and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
	
	char [] letters =new char[5]; 
	letters [0]='A';
	letters [1]='B';
	letters [2]='C';
	letters [3]='D';
	letters [4]='F';
	System.out.println(letters [1]);
	System.out.println("==========2nd Way========");
	char[] letters2 ={ 'A','B','C','D','E','F'};
System.out.println(letters2[1]);	
	}

}

package com.syntax.class06;

public class OddNumbersWhile {

	public static void main(String[] args) {
		//first way incrementing class
	int count=1;
		while (count<=20) {
			System.out.println(count);
		count+=2;
		}
		//2nd way
	int num=1;
	
	while (num<=20) {
		if (num%2!=0) {
			System.out.println(num);
		}
	num++;
	}
	}
	}



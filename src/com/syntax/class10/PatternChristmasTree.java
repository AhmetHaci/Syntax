package com.syntax.class10;

public class PatternChristmasTree {
	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x<=5) {
				for(int y=1; y<=x; y++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int y=1; y<=10-x; y++) {
					System.out.print("*");
				}
				System.out.println();
	}
		}
	}
}

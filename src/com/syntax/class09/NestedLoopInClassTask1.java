package com.syntax.class09;

public class NestedLoopInClassTask1 {
	public static void main(String[] args) {
		// Using nested loop to print 10 to 99
		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i+""+y);
			}
		}
	}
}

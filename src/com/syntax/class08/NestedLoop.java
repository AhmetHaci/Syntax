package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// loop inside the loop is nested loop
		
		for (int i=1; i<=3;i++) {
			//System.out.println(i);
			for (int y=3;y<=3;y++) {
				System.out.println(i+" "+y);
			}
		}

	}

}

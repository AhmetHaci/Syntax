package com.syntax.class09;

public class NestedLoopCarMileage {

	public static void main(String[] args) {

		for (int one = 0; one < 10; one++) {
			for (int two = 0; two < 10; two++) {
				for (int three = 0; three < 10; three++) {
					for (int four = 0; four < 10; four++) {
						System.out.println(one + " " + two + " " + three + " " + four);
					}
				}
			}

		}

	}

}

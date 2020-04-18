package com.syntax.class27;

public class Recap {
	public static void main(String[] args) {
		// to store a single value
		int num = 10;
		// to store multiple values we use array
		int[] array = { 10, 20, 30 };

		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr[0]);
		// to retrive all values 1 by 1
		for (int num1 : arr) {
			System.out.println(num1);
			System.out.println();
			// using for loop
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			// we can store non primitive type objects

		}
	}
}
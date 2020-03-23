package com.syntax.class11;

public class TaskArray {

	public static void main(String[] args) {
		String cars[] = { "American", "German", "Korean", "Italian" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		String vehicles[] = new String[4];
		vehicles[0] = "American";
		vehicles[1] = "German";
		vehicles[2] = "Korean";
		vehicles[3] = "Italian";
		System.out.println(vehicles[0]+" "+ vehicles[1]+" "+ vehicles[2]+" "+vehicles[3]+" ");
	}

}

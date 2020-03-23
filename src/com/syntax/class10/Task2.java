package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all integer elements in
		// an array.

		int[] total = new int[4];
		total[0] = 2;
		total[1] = 4;
		total[2] = 6;
		total[3] = 8;
		for (int i=0;i<total.length;i++)total[i]=i;
			int sum=0;
			for (int b:total)sum+=b;
			System.out.println(sum);
	}

}

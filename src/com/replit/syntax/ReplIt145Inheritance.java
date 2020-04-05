package com.replit.syntax;

public class ReplIt145Inheritance {
	
	 public static int sum2D(int[][] nums) {
			int sum = 0;
			// sum of each individual row
			for (int row = 0; row < nums.length; row++) {

				for (int col = 0; col < nums[row].length; col++) {
					sum = sum + nums[row][col];
				}
			}
			return sum;
		}
	}
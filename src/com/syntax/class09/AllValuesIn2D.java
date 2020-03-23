package com.syntax.class09;

public class AllValuesIn2D {

	public static void main(String[] args) {
		int [][] num= {
				{1,2,3,4,5,},
				{6,7,8,9,10},
				{11,12,13,14,15}};
		for (int row=0;row<num.length;row++) {
			for (int col=0;col<num.length;col++) {
				System.out.print(num [row][col]+" ");
			}
		}
	}

}

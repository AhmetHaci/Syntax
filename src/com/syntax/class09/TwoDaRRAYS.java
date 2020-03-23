package com.syntax.class09;

public class TwoDaRRAYS {

	public static void main(String[] args) {
		//2D Arrays
		//1 row
		int [][] num=new int [3][5];
		num[0][0]=10;
		num[0][1]=12;
		num[0][2]=43;
		num[0][3]=11;
		num[0][4]=22;
		//2 row
		num [1][0]=20;
		num [1][1]=45;
		num [1][2]=56;
		num [1][3]=1;
		num [1][4]=33;
		//row 3
		num [2][0]=20;
		num [2][1]=45;
		num [2][2]=56;
		num [2][3]=1;
		num [2][4]=23;
	System.out.println(num[2][3]);
	System.out.println("=====2nd Way============");
	int[][] num2= {
			{1,2,3,4,5,},
			{6,7,8,9,10},
			{11,12,13,14,15}};
	System.out.println(num2[2][1]);
	}

}

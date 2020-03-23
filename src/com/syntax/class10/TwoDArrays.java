package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
	
		int [][] numbers=new int [3][4]; // first [rows] second one [columns]
		//1st row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2nd row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
	   //2rd row
		
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=3;
		//print value 
	System.out.println("Your choosed number is "+numbers[1][2]);
	
	System.out.println("*************Shorter way***********");
	
	int [][] nums= { { 10,20,30,40},{5,10,15,20},{1,2,3,4}}; // arrays of 3 single dimensional arrays
	
	System.out.println("You have choosed "+nums[0][2]);
	}
}

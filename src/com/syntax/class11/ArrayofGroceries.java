package com.syntax.class11;

public class ArrayofGroceries {

	public static void main(String[] args) {
		String [][] groceries= {
				{"cucumber","Potatoe","Carrot"},
				{"mango","apple","banana","kiwi"},
				{"Milk","cheese","Yougurt"} };
		System.out.println(groceries[1][2]);
	System.out.println("get all the values");
	
		for (int r=0;r<groceries.length;r++) {
			for (int c=0;c<groceries[r].length;c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
				System.out.println("Getting elements using advance for loop");
				
				
			for ( String[]array:groceries)
				for (String items:array) {
					System.out.print(items+" ");
				}
			System.out.println();
	}
	}



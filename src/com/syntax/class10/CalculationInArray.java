package com.syntax.class10;

public class CalculationInArray {

	public static void main(String[] args) {

		int ahmet []= { 10,20,30,40};
		int sum=0;
		for (int i=0;i<ahmet.length;i++) {
			sum+=ahmet[i];
			
		}
		System.out.println(sum);
	System.out.println("+======enhanced for loop=============");
	
	int k[]= {4,8,9,50};
	
	
	int sum1 = 0;
	for (int j:k) {
		sum1+=j;
	}
	System.out.println(sum1);
	
	System.out.println("=====more practice===========");
	
	int pra[]= {78,9,45,78,36,12};
	int total1=0;
	 for (int p:pra) {
		 total1+=p;
	 }
	System.out.println(total1);
	}
	
	}



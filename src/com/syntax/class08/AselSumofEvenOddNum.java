package com.syntax.class08;

public class AselSumofEvenOddNum {

	public static void main(String[] args) {
		// sum of even odd numbers
		int evenSum=0;
		int oddsSum=0;
		int grandTotal=0;
		for (int i=1;i<=50;i++) {
			if  (i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddsSum=oddsSum+i;
			}
		grandTotal+=i;  //second way to calculate grandtotal
		}
	//grandtotal=evenSum+evenOdd;	/second way to calculate grand total
	System.out.println("Sum of evens "+ evenSum);
	System.out.println("Sum of odds "+ oddsSum);
	System.out.println(grandTotal);
	}

}

package com.syntax.class25;

public class FinalKeyword {
	
		   public  static final double avgElements (int [] a) {
		   double average =0.0;
		   double sum=0.0;

		     for ( int num:a){
		       sum+=num;
		       average=sum/a.length;
		     }
		     return average;
		     }
			public static void main(String[] args) {
				int[] a = {2,7,3,8,4};
				System.out.println(avgElements(a)); //should print 4.8
			}
		}

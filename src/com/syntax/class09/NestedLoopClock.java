package com.syntax.class09;

public class NestedLoopClock {

	public static void main(String[] args) {
		System.out.println("****This is our military clock****");
		for (int h=0;h<24; h++) {
		for (int m=0;m<60; m++) {
			for (int s=0;s<60;s++) {
				System.out.println(h + ":" + m+" :"+s);
			}
		
					
			}
		}
	}

}
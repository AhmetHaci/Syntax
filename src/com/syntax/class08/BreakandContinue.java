package com.syntax.class08;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//once iequals 4 we want to stop
		for (int i =1; i<=10;i++) {
			if (i==4){
				System.out.println("I m stopping the loop ");
				break;
			}
			System.out.println("I m inside the loop");
			System.out.println(i);
		}
System.out.println("I m outside of the loop");
	}

}

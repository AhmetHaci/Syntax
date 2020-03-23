package com.syntax.class08;

public class Conitinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for (int i =1; i<=10;i++) {
			if (i==4){
				System.out.println("I m skipping iteration ");
				continue;
			}
			System.out.println("I m inside the loop");
			System.out.println(i);
		}
System.out.println("I m outside of the loop");
	}

}





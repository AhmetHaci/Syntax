package com.syntax.class28;

public class WrapperClassExp {

	public static void main(String[] args) {
		Integer num = 250 ;
		
		String myNum=num.toString().replaceAll("250", "500");
		System.out.println(myNum);

	}

}

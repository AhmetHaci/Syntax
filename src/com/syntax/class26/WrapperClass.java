package com.syntax.class26;

public class WrapperClass {

	public static void main(String[] args) {

		int i = 10;
		// i. nothing comes because int is a class
          
		//Autoboxing converting primitive type to an object type
		Integer num = 10;
		String s = num.toString(); // it comes because num is an object
		System.out.println(num.MIN_VALUE);

		Byte b = 90;
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		String s1 = b.toString();
		System.out.println(s1);
		
		Boolean bool =true;
		//auto unboxing
		boolean b1=bool;

	}

}

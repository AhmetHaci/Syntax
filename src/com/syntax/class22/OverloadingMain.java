package com.syntax.class22;

public class OverloadingMain {
static String str="Syntax";

	

	public static void main(int[] args) {

		System.out.println("Method with int array arguments "+2);

	}

	

	public static void main(String args) {

		System.out.println("Method with String argument "+ "patates");

	}

	

	public static void main(String elma, String armut) {

		System.out.println("Method with 2 String argument "+ "elma " + "armut" );

	}

	

	public static void main(String args, int num) {

		System.out.println("Method with 2 String argument "+ 312);

	}

	

	public static void main(int num, String args) {

		System.out.println(45+ " Method with 2 String argument");

	}

	

	public static void main(String[] args) {//Java always looks for this main method with this signature

		System.out.println("Method with String array arguments");

		OverloadingMain.main("str");

		main(str);

		main("hello", "hi");

		//int[] arr=new int[2];

		main(new int[2]);

	}

}

	

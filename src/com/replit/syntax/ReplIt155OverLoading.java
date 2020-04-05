package com.replit.syntax;

public class ReplIt155OverLoading {


		
	static void method(){
	    System.out.println("static method without parameter");
	  }
	  static void method(int a){
	     System.out.println("static method with int parameter");
	  }
	  public static void main(String[] args) {
	   
	   method();
	   method(10);
	  }
	}
		
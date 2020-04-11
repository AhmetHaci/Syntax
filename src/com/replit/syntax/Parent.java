package com.replit.syntax;

public class Parent {
	  public void study (int a ){
		    System.out.println("I am parent public method");

		  }
		  protected void study (String a){
		    System.out.println("I am parent protected method");
		}
		   void study (int a, int b ){
		    System.out.println("I am parent default method");
		}

		private  void study (String a, String b){
		    System.out.println("I am parent private method");
		}
		}

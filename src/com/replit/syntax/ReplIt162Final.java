package com.replit.syntax;

public class ReplIt162Final {

	final void  m1 (boolean white) {
		System.out.println("Final method with boolean parameter");
	}
	
	final void  m2 (String black) {
		System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		ReplIt162Final call = new ReplIt162Final ();
		call.m1(true);
		call.m2("black");
	}
}

package com.syntax.class21;

public class HomeWork {

	
	static int square (int l) {
		int Square = l*l;
		System.out.println(Square);
		return Square;
	}

	static int rectangle ( int l, int h) {
		int Rectangle= l*h;
		System.out.println(Rectangle);
		return Rectangle;
	}

	static int box ( int l , int width, int h) {
		int Box =2* (l*width+l*h+width*h);
		System.out.println(Box);
		return Box;
	}
}


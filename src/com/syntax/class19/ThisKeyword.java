package com.syntax.class19;

public class ThisKeyword {
	int a;
	int b;
	public ThisKeyword(int a, int b) {
	 this.a=a;
	 this.b=b;
	 
	}
public void sum ( int a, int b) {
	System.out.println("sum of local " +( a+b));
	System.out.println("sum of instance var "+ ( this.a+this.b));
}
public static void main(String[] args) {
	ThisKeyword obj = new ThisKeyword(10,20);
	obj.sum(100, 200);
	ThisKeyword obj2 = new ThisKeyword(10,20);
	obj2.sum(20, 40);
}
}

package com.sytntax.class18;

public class Task3 {

	public Task3 () {
		//static constructor () will give CE error
	System.out.println("public constructor");
	}

	Task3 (int num){
	System.out.println("defaul cons");
}
protected Task3 ( int num, int num1) {
	System.out.println("protected cons");
}

 private Task3 (String str) {
	 System.out.println("private cons");
 }
 public static void main(String[] args) {
	 Task3 obj=new Task3 ();
	 Task3 obj1=new Task3 (12);
	 Task3 obj2=new Task3 (12,13);
	 Task3 obj3=new Task3 ("Hello");
	 
}
}
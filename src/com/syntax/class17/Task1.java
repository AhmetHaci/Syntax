package com.syntax.class17;

//      Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
//		Method should be visibly only within same package and accessible by the creating an instance of the class.
public class Task1 {
	protected int array(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		return total;
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		int[] a = { 2, 7, 19, 857 };
		System.out.println("total: " + obj.array(a));
	}
}

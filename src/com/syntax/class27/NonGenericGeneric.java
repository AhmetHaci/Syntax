package com.syntax.class27;

import java.util.ArrayList;

public class NonGenericGeneric {

	public static void main(String[] args) {  // Non Generic example 
		ArrayList<Object> myList=new ArrayList<>(); 
		myList.add("Hello");
		myList.add(1);
		myList.add(2.99);
		myList.add(false);
		myList.add('$');
	  System.out.println(myList);
		
		System.out.println("====================");
		
	  ArrayList<Integer>arrayList=new ArrayList<Integer>(); //Generic
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(5);
		arrayList.add(1);
	
		
		for (Integer list:arrayList) {
			System.out.print(list+" ");
		}
	}

}

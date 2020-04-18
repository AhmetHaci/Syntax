package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("Ahmet");
		arrayList.add("Hassna");
		arrayList.add("Tugba");
		arrayList.add("Kemal");
		arrayList.add("Gulbahar");
		
		//retieve values from an array list 
		//1- for loop
		
		for ( int i=0; i<arrayList.size();i++) {
			
		}
		System.out.println(arrayList);
	

	//2-using enhanced for loop
	for ( String a: arrayList) {
		System.out.println(a);
	}
	System.out.println();
	//3rd way Iterator 
	Iterator<String>it=arrayList.iterator();
	System.out.println(it);
}
}


package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList <String> list = new LinkedList<>();
	list.add("Hello");
	list.add("Bye");
	list.add("OK");
	list.add(2, "How are you ? ");
	System.out.println(list);
	
	
	//replace 1 element
	list.set(1, "Good bye");
	System.out.println(list);
	//retrieve 1 element
	System.out.println(list.get(2));
	
	//retrieve all elements
		for ( int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for (String myList : list) {
			System.out.print(myList+" ");
		}
		System.out.println();
		Iterator <String >mynewlist=list.iterator(); 
		while ( mynewlist.hasNext()) {
			System.out.print(mynewlist.next()+" ");
		}
	
	
	}

}

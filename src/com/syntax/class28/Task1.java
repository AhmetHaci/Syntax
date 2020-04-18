package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {

	public static void main(String[] args) {
		LinkedList <String> llist = new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("OK");
		llist.add(2, "How are you ? ");
		System.out.println(llist);
		System.out.println();
		
		Iterator <String >mynewlist=llist.iterator(); 
		while ( mynewlist.hasNext()) {
			System.out.print(mynewlist.next()+" ");
		}
	}

}

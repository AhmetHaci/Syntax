package com.syntax.class28;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		
		List<String>Ilist= new ArrayList();
		Ilist.add("Farid");
		Ilist.add("Saif");
		Ilist.add("Aaron");
		Ilist.add("Ismail");
		Ilist.add("Brian");
		Ilist.add("Turker");
		Ilist.add("Al");
		
		//remove names shorter than 5 char
		
		for ( int i =0;i<Ilist.size();i++ ) {
			if ( Ilist.get(i).length()<=4) {
				Ilist.remove(i);
				
			}
		}
		System.out.println(Ilist);
		List<String>mylist= new ArrayList();
		mylist.add("Farid");
		mylist.add("Saif");
		mylist.add("Aaron");
		mylist.add("Ismail");
		mylist.add("Brian");
		mylist.add("Turker");
		mylist.add("Al");
		
		Iterator <String>l=mylist.iterator();
		while (l.hasNext()) {
			if(l.next().length()<=5) {
				l.remove();
				
			}
					}
		System.out.println(mylist);
	}

}

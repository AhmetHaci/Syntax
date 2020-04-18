package com.replit.syntax;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReplIt188List {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
	
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		

		Iterator <String>  l= countries.iterator();
		while (l.hasNext()){
		 if (l.next().contains("A"));
		l.remove();
			
		System.out.println(l); //[USA, Kazakhstan, Pakistan, Russia]
		}
			
		
	
		
		
	}
}


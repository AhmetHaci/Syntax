package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("Ahmet");
		arrayList.add("Servet");
		arrayList.add("Ali");
		arrayList.add("Serhan");
		arrayList.add("Ismail");
		
		Iterator<String>myNewLoop=arrayList.iterator();
		while ( myNewLoop.hasNext()) {
			System.out.print(myNewLoop.next()+" ");
		}
	}

}

package com.replit.syntax;

import java.util.*;

public class Repl185List {

	public static void main(String[] args) {
		
		
		List<Boolean>listA = new ArrayList <>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		List<Boolean>listB = new ArrayList <>();
		listB.addAll(listA);
		
		Iterator<Boolean> myl = listB.iterator();

		while (myl.hasNext()) { 
			Boolean newList = myl.next();

			System.out.println(newList );

		}

		System.out.println();
		
	}
}

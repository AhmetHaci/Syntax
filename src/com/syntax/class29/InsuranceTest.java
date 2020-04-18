package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance>list = new ArrayList();
		list.add(new Car ("Geico","Honda"));
		list.add(new Pet ("PetLove", " Husky"));
		list.add(new Health (" BCB Shield"));
		
		for (Insurance l: list) {
			l.getQuote();
			l.CancelInsurance();
			
		}

		System.out.println("===with ITERATOR===");
		Iterator<Insurance>myList=list.iterator();
		while ( myList.hasNext()) {
			Insurance newList=myList.next();
		newList.getQuote();
		newList.CancelInsurance();
		}
	System.out.println("=====regular for loop");
		for ( int i=0;i<list.size();i++) {
			list.get(i).getQuote();
			list.get(i).CancelInsurance();
		}
	}

}

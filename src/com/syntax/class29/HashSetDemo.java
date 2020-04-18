package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a collection that store only unique object we don t care about the order
		HashSet<String>breakfast=new HashSet <>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		//how many elements in the set ?
		int size = breakfast.size();
		System.out.println(size); // in set we cannot have duplicate elemenets
		//order is not maintained ... it s not in inserted order
		System.out.println(breakfast);

		 //we need to retrieve element --> no get method available for set
	 //all element retrieve
		
		//REGULAR FOR LOOP IS NOT AVAILABLE FOR SET CUZ WE HAVE NO ,get (i) method 
		
		Iterator<String>l=breakfast.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("ADVANCE");
		for (String h:breakfast) {
			System.out.println(h);
		}
		
	}

}

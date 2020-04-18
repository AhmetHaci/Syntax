package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	     public static void main(String[] args) {
	    // stro sudents id and corresponding name 	 
	    // LinkedHasMap preserves the insertation order	 
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(10000, "John Smith");
		lmap.put(10001, "Jane Smith");
		lmap.put(10002, "Faisal Sahki");
		lmap.put(102, "Ali Tarlaci");
		System.out.println(lmap);
		
		//store object in a from af k and v and you want to sort your keys is ascending order
	Map<Integer, String> tmap = new TreeMap <>();
		tmap.put(10000, "John Smith");
		tmap.put(10001, "Jane Smith");
		tmap.put(10002, "Faisal Sahki");
		tmap.put(102, "Ali Tarlaci");
		System.out.println(tmap);

		//create a map of country and population and sort countries in alphabetic order
		
		Map<String, Integer > pop = new TreeMap <>();
		pop.put("USA", 330000000);
		pop.put("Kazakhstan", 18000000);
		pop.put("India", 1326000000);
		pop.put("Afganistan", 37000000);
		
		
		System.out.println(pop);
		
	}

}

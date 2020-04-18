package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {
		//hashmap is not maintain order. 
	
	HashMap <String,String>hmap=new HashMap <>();
	//to store values into Map we use put
	hmap.put("Name", "John");
	hmap.put ("Last Name ", "Smith");
	hmap.put("Address", "123 Test");
	hmap.put("City", "Atlanta");
	
	
	//how to check f map has any value
	
	boolean isEmpty = hmap.isEmpty();
	System.out.println("Map is empty "+ isEmpty);
	
	//how many elements in map
	
	System.out.println(hmap.size());
	
	//add more values 
	hmap.put("Zip", "30040");
	
	
//reassiginng but we cannot have duplicate values
	hmap.put("Name", "Jame");
	System.out.println(hmap);
	
	//how to access the value, and speify the key , name assigned to Jame
	System.out.println(hmap.get("Name"));
	
	//how to remove tha value
	hmap.remove("Zip");
	
	//replace the value from Atlanta to LA
	hmap.replace("City", "Los Angeles");
	System.out.println(hmap);
	
	
	}

}

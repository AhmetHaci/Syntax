package com.syntax.class27;

import java.util.LinkedList;

public class LinkedIntro {

	public static void main(String[] args) {
		LinkedList <String>list = new LinkedList<>();
		list.add("Selam");
		list.add("naber");
		list.add("iyilik kanka");
		System.out.println(list.size());
		
		list.add("Selam ben geldim yine");
		list.add("Naber moruk");
		
		//retrieve
		System.out.println(list.get(1));
		
		//update /  replace
	list.set(2, "akilli olun");
	System.out.println(list);
	
	//how to retrieve all values from linked list

	}

}

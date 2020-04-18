package com.syntax.class28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IQ {

	public static void main(String[] args) {
		List <String>aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		System.out.println(aList);
	    
		
		
		
		
		List<String> newList = aList.stream().distinct().collect(Collectors.toList()); 
	    System.out.println(newList);    
	}
}

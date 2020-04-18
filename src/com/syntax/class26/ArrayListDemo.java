package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//create and arraylist with names
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("John");
		arrayList.add("Gulbahar");
		
		//access those elements from arrayList
		
		String secondElement= arrayList.get(1);
		System.out.println(secondElement);
		
		//arraylist is dynamic array
		arrayList.add("Jane");
		arrayList.add("James");
		
		//how to get number of elements inside arrayList
		int size =arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hichem");
		System.out.println(arrayList.size());
		
		//how to remove on arraylist
		arrayList.remove("Jane");
		System.out.println(arrayList.size());
		
		//adding another jane to our arraylist
		arrayList.add("Jane");
		System.out.println(arrayList.size());
		
		//printing your arraylist
		System.out.println(arrayList);
		
		//add new names with their index
		arrayList.set(1, "Ahmet");
		System.out.println(arrayList);
		
		//difference between array and array list
		//array list dynamic / array static
		// array list has methods / arrays has no methods
		
		//how to retrive values from arraylist 1 by 1
		
		for ( int i = 0 ; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
		System.out.print(element+" ");
		System.out.println();
		}
		System.out.println("Advance loop =============");
		
		for ( String a:arrayList) {
			System.out.print( a+" ");
		}
		
		}
	}



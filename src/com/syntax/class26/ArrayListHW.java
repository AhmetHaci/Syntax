package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListHW {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Saif");
		name.add("Servet");
		name.add("Kemal");
		name.add("Ismail");
		name.add("Mike");

		System.out.println("is there any empty names in my array => " + name.isEmpty());

		System.out.println("Do we have my friend Mike in my array => " + name.contains("Mike"));

		System.out.println("How many names I have in this array => " + name.size());

		System.out.println("Total names in my array are " + name);
		System.out.println();
		for ( String friends : name) {
			System.out.println(friends);
		}
	}
}
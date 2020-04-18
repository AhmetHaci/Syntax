package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetFamilyMembers {

	public static void main(String[] args) {
		Set <String>fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grape");
		fruits.add("Kiwi");
		fruits.add("Grape");   // if you have duplicate it will take the first variable 
		fruits.add("Pinapple");
		fruits.add("Banana");
		System.out.println(fruits.size());
		System.out.println(fruits);
		

	}

}

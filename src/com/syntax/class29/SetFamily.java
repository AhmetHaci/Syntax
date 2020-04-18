package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		Set<String>veggies=new HashSet <>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		System.out.println(veggies); //set does not allow duplicates
		
	//	if you want to keep them in insert order LinkedHashSet
		Set<String>fruits=new LinkedHashSet <>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("pear");
		fruits.add("tomato");
		fruits.add("mango");
		System.out.println(fruits); //set does not allow duplicates
		
		//if you want in ascending order use TreeSet
		
		//Set<String>food=new TreeSet <>(fruits); <-- you call add all fruits collection by adding food as param
		Set<String>food=new TreeSet <>(veggies);
		food.addAll(fruits); // you can add all fruits collection with this method
//		food.add("carrot");
//		food.add("potato");
//		food.add("cucumber");
//		food.add("eggplant");
//		food.add("potato");
//		food.add("cucumber");
		System.out.println(food); //set does not allow duplicates
		
	}

}

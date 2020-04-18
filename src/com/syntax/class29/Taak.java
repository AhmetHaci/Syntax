package com.syntax.class29;

import java.util.*;

public class Taak {

	public static void main(String[] args) {
		Set <String> countrie = new TreeSet<>();
		countrie.add("Turkey");
		countrie.add("Azerbayjan");
		countrie.add("Adana");
		countrie.add("Mongolia");
		countrie.add("USA");
		
		System.out.println(	countrie);
		
		for (String l: countrie) {
			System.out.println(l);
		}
		
			Iterator<String>my=countrie.iterator();	
		while  (my.hasNext()){
		System.out.println(	my.next());
		}

	}

}

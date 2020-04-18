package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {
	 Set <Integer> set = new HashSet<>();
	 set.add(12);
	 set.add(1);
	 set.add(78);
	 
	 Iterator<Integer>s=set.iterator();
	 while( s.hasNext()) {
	System.out.print(s.next()+" ");
	 }
	 
	 
	}

}

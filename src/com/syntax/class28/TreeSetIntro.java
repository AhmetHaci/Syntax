package com.syntax.class28;

import java.util.Set;
import java.util.*;

public class TreeSetIntro {

	public static void main(String[] args) {

		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);
		System.out.println(tset); // TreeSet  given variables in order and doesn t allow duplicates
		//in TreeSet  it will be 0  -> 9 and A-Z
		
		
	}

}

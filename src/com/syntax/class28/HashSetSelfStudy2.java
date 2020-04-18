package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSelfStudy2 {

	public static void main(String[] args) {
		Set<Sweets> sweetSet = new HashSet<>();
		Sweets sweet = new Sweets ("Cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Makarons"));
		sweetSet.add(new Sweets("Chocolatte"));
		sweetSet.add(new Sweets("Ice Cream"));
		sweetSet.add(sweet);
		System.out.println(sweetSet.size());
		
		System.out.println("1st Way advance loop");
		
		for (Sweets s:sweetSet) {
			System.out.print(s.name+" ");
		}
		System.out.println("\n2nd Way Iterator");
		Iterator <Sweets>s=sweetSet.iterator();
		while (s.hasNext()) {
		System.out.print(s.next().name+" ");
		
		}		

	}

}

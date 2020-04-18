package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSelfStudy {

	public static void main(String[] args) {
		// hashset ile duplicate yazilima izin vermez eger yazilirsa override olur

		HashSet<String> hashset = new HashSet<>();
		// hashsete bilgi eklemek su sekilde olur
		hashset.add("Galatasaray");
		hashset.add("Fenerbahce");
		hashset.add("Besiktas");
		hashset.add("Trabzonspor");
		hashset.add("Adana Demirspor");
		hashset.add("Galatasaray");
		

		System.out.println(hashset.size()); // 6 element olmasina ragmen 5 cikacak Galatasarayimiz iki defa yazildi ama
											// bir tanesi size(); icerisine giriyor
		System.out.println(hashset); // burada gordugunuz gibi Galatasarayimiz canimiz cigerimiz bir defa yazildi
		System.out.println();
		System.out.println("Retrieve etmek icin 1- ITERATOR kullanmamiz gerekiyor");
		Iterator<String> h = hashset.iterator();
		while (h.hasNext()) {
			String el = h.next();
			System.out.print(el + " ");

		}
		System.out.println();
		System.out.println("Retrieve etmek icin 2-ADVANCE FOR LOOP kullanmamiz gerekiyor");
		for (String l : hashset) {
			System.out.print(l + " ");
		}
	}

}

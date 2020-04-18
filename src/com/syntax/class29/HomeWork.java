package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork {

	public static void main(String[] args) {
		Map<String, Integer> hw = new HashMap<>();

		hw.put("International Market ", 1);
		hw.put("Syntax ", 2);
		hw.put("Farid & Farid Attorney", 3);
		hw.put("Yunus Jewelery", 4);
		hw.put("Barber Shop", 5);
		hw.put("Miskiel Finance", 6);
		hw.put("Masjid", 7);

		System.out.println(hw.size()); // shows how many entries, output will be int 7

		hw.put("Turker Jewelery", 4); // updating 4
		hw.remove("Masjid"); // removing value

		System.out.println(hw); // printing map

	}

}

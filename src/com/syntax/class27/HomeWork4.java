package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork4 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>(); 
		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
				num.add(i);
			}

		}
		System.out.println(num);
		Iterator<Integer> newNum = num.iterator(); 
		while (newNum.hasNext()) {
			if (newNum.next() % 5 == 0) {
				newNum.remove();
			}
		}
		System.out.println(num);
	}
}

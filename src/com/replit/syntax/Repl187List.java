package com.replit.syntax;

import java.util.LinkedList;
import java.util.List;

public class Repl187List {
	public static void main(String[] args) {

		List<Integer> my = new LinkedList<>();

		my.add(111);
		my.add(222);
		my.add(333);
		my.add(444);
		my.add(555);
		my.add(666);

		int sum = 0;
		for (int i : my) {
			sum += i;

		}
		System.out.println(sum);
	}

}

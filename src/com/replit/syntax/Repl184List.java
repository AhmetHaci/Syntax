package com.replit.syntax;

import java.util.*;

public class Repl184List {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-1);
		a.add(1);
		int fib = 1;
		while (fib < 11) {
			a.add(((Integer) a.get(fib)) + ((Integer) a.get(fib - 1)));
			fib++;
			System.out.print(a.get(fib) + " ");
		}
	}

}

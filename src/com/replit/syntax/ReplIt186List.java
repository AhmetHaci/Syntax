package com.replit.syntax;

import java.util.LinkedList;
import java.util.List;

public class ReplIt186List {

	static boolean isPrime(long num) {

		double limit = Math.sqrt(num);
		for (long i = 2; i < limit; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {

		List<Integer> isPrime = new LinkedList<>();

		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				isPrime.add(i);
			}
		}
		
		System.out.println(isPrime);

	}
}
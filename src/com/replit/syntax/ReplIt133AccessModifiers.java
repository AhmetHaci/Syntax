package com.replit.syntax;

public class ReplIt133AccessModifiers {

	static String alphabetical(String str) {

		String new_word = "";
		char[] x = str.toCharArray(); //Asel bize charArray gostermedi
		new_word += x[0];
		for (int i = 1; i < x.length; i++) {
			if (x[i] > x[i - 1]) { // Gulsum
				new_word = new_word + x[i];
			}

		}

		return new_word;

	}
	public static void main(String[] args) {
	System.out.println(alphabetical("hello"));
	}
}

package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
//Create a String and if the String is not empty perform the following: 
//	if the String has an odd number of characters and has 3 or more characters,
//	print the character in the middle of the String.

		String friend = "HassnaLiliy";

		if (!friend.isEmpty()) {
			if (friend.length() % 2 != 0 && friend.length() >= 3) {
				System.out.println(friend.charAt(friend.length()  / 2));
			} else {
				System.out.println(" this is not what we want");
			}
		}
	}
}


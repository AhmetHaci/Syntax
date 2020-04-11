package com.replit.syntax;

public class ReplIt163Final {

	final void reverse(String name) {
		name = "hello";

		String reversed = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversed = reversed + name.charAt(i);
			
		}
	}

	public static void main(String[] args) {
		ReplIt163Final obj = new ReplIt163Final ();
		obj.reverse("Serra");
	}
}

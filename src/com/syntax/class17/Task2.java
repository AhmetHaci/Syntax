package com.syntax.class17;

   public class Task2 {
//	Create a method that will take a String as a parameter and returns reverse String.
//	Method should be available to all classes within your projects and accessible by class name.
	public static String tugba(String t) {
		String reverse = "";
		for (int i = t.length() - 1; i >= 0; i--) {
			reverse = reverse + t.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		Task2 obj = new Task2();
		System.out.println(obj.tugba("tugba"));
	}

}

 
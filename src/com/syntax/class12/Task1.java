package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		// Create a String and print in reverse order

		String reverse = "";
		String name = "Syntax";

		for (int i = name.length() - 1; i >= 0; i--) {
			 reverse += name.charAt(i);

		}

		System.out.println(reverse);
		
		System.out.println("tugba ablanin gizli grubu");
		String sentc="I love Java"; //ayni
		char revers; //konteyner farkli
		for( int i=sentc.length()-1; i>=0; i--) { //ayni
			revers=sentc.charAt(i); //ayni sayilir ittifakla/ tugba abla serh koydu
			System.out.print(revers);
		}
	}

}
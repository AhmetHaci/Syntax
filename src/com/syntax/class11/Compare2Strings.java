package com.syntax.class11;

public class Compare2Strings {

	public static void main(String[] args) {
		// to compare 2 Strings
		System.out.println("****Equals()***and***equalsIgnoreCase() FUNCTION****");
		
		String s1 = "Merhaba hayat !";// (s1.equals(s2))
		String s2 = "mErHaba hAYat !"; // s1.equalsIgnoreCase(s2));

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	
	
		String beklenen="Home - Instagram recently watched";
        String olan="   Home - Instagram recently watched "; // fazladan spaceler var
        
        //
        if(olan.equals(beklenen)) {
            System.out.println("Test case pass. Titles are matched");
        }else {
            System.out.println("Test case fails. Titles are NOT matched");
        }
        
		
	}
}
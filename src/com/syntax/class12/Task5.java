package com.syntax.class12;

public class Task5 {

	public static void main(String[] args) {
// Create a String that should be combination of letters, numbers and special characters. 
//Find out how many alpha characters are there in the String.

		String name="hgpiuqw2471@#%^*!567egkj4682256866";
	    name=name.replaceAll("[^A-Za-z]", "");
	       // name1=name.length();
	    	  System.out.println(name);
	    }
	  
		
	}



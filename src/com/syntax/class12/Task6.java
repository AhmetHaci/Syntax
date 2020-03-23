package com.syntax.class12;

public class Task6 {

	public static void main(String[] args) {
//You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?
//” How would you find out how many words are in that String?
		String hassnaStudy = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String newhassnaStudy[] = hassnaStudy.split(" ");
		int result = newhassnaStudy.length;
		System.out.println(result);

	}
}
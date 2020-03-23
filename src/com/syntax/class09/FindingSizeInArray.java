package com.syntax.class09;

public class FindingSizeInArray {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Nilufer";
		names[1] = "Ahmet";
		names[2] = "Hira";
		names[3] = "Serra";
		names[4] = "Akif";
		System.out.println(names.length);
		System.out.println("=====printing all values========");
		names[0] = "Nilufer";
		names[1] = "Ahmet";
		names[2] = "Hira";
		names[3] = "Serra";
		names[4] = "Akif";
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i] + " ");
		System.out.println("=====other way=========");
		// 2nd way
		String[] name1 = { "Nilufer", "Ahmet", "Hira", "Serra", "Akif" };
		for (String name : name1) {
			System.out.print(name + " ");
		}
	}

}

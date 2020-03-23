package com.syntax.class09;

public class MoreArryas {

	public static void main(String[] args) {
		// arrays are fixed in size ( eger 3 den fazla arrays yazarsan print ederken
		// hata verir
		String[] student = new String[2];
		student[0] = "Hassna";
		student[1] = "Faisal";
		student[2] = "Kemal";
		student[3] = "Aaron"; // java will give errror because "Aaron" is out pof the size
		System.out.println(student[3]);
System.out.println("=================more arrays");
		String[] inClass = new String[5];
		inClass[1] = "Ali";
		inClass[2] = "Veli";
		inClass[3] = "Zafer";
	
		System.out.println(inClass[1]);
	}

}

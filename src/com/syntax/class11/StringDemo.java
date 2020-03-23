package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		String school="Syntax  "; //when you put space it counts spaces too
		String str=new String ("Hello ");
		String str1="This is a String 7896,&,%*";
        // how many character String has
		System.out.println(school.length()); //count number of characters

	int size=str.length(); // converting String size to int and finding numbers of the characters
	System.out.println("String length is "+size);
	
	System.out.println(school.toUpperCase());//convert String to lowercase or uppercase
	System.out.println(str.toLowerCase());
	String newStr=str+school; 	//concatinate 2 Strings
	System.out.println(newStr);
	String day="Saturday, ";
	String date="14";
String newDate=day.concat(date); // 2nd way cancatination 
System.out.println(newDate);

char grade='A';
String str2="Student"; //below code will give complier error we can use concat metod for String
//System.out.println(str2.concat(grade);

System.out.println("=====isEmpty Function===============");

String str3=" ";
boolean emp =str3.isEmpty();
System.out.println(emp); // dolu mu bos mu , bunu true false olarak veriyor

System.out.println("=======trim function=======");

String str4="Welcome to Syntax!   ";
System.out.println(str4.trim()); // trip basta ve sondaki bosluklari kesiyor



	}

}

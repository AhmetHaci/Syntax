package com.replit.syntax;

public class ReplIt131AccessModifiers {
String name;
String city;
String name_of_the_school;
int batch_number;

public void display () {
	System.out.println("My name is "+name+" and I live in "+city+" I study at "+name_of_the_school+" in batch "+batch_number);
}
public static void main(String[] args) {
	
	ReplIt131AccessModifiers my = new ReplIt131AccessModifiers ();
	my.name="John ";
	my.city="Miami";
	my.name_of_the_school="Syntax ";
	my.batch_number=6;
	my.display ();
}

}

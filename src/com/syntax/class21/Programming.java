package com.syntax.class21;

public class Programming {

	 Programming (){
		 System.out.println("I love programming");
	 }
	 
	 String name;
	 Programming (String name){
		 this.name=name;
		 System.out.println("I love "+name);
	 }
	 public static void main(String[] args) {
		 Programming obj1 = new Programming ();
		 Programming obj2 = new Programming ("Python");
	}
}

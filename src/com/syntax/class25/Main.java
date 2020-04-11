package com.syntax.class25;

public class Main {
	  public static void main(String[] args) {
		  Animal [] cats = {new Cat("Cat"), new Kitten1("Kitten1"), new Kitten2("kitten2"), new Kitten3 ("Kitten3")};
		  for (Animal a: cats){
		    a.eat();
		    a.sleep();
		  }
		   }
		  }

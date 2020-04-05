package com.replit.syntax;

public class ReplIt147SuperKeyword {

//	In parent class
//	Create a non argument constructor and write a logic to print "This is Parent constructor"
//
//	Create a Child Class that will be subclass of the Parent class.
//	Create a constructor without parameter and call parent class constructor expicitly
//
//	In Main Class. 
//	Create and object of Child class and run the application. 

//	This is Parent constructor

	ReplIt147SuperKeyword() {
		System.out.println("This is Parent constructor");
	}
}

class Child extends ReplIt147SuperKeyword {
	
	Child (){
		super();
		System.out.println();
	}

}

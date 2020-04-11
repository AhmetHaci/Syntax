package com.syntax.class24;

//complier force you to change it to abstract class
public abstract class Phone {
	// implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendText() {
		System.out.println("Send text");
	}

	// unimplemented method (method which has no body )
	public abstract void takePictures();
	//you can have as many  abstact method as much 
	public abstract void playGames();

}
//the child class that provides all the implementation from abstract methods from abstract
//class called
class Iphone extends Phone {
	//compiler will give error you need to add methods
	@Override
	public void takePictures() {
		System.out.println("Iphone takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Iphone");
		
	}
	
}

class Samsung extends Phone {
	//the child class that provides all the implementation from abstract methods from abstract
	//class called
	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Samsung play games");
		
	}
	
}

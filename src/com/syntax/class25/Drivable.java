package com.syntax.class25;

public interface Drivable {
	// interface class is collection of public static final variables
	//when we say final in the future we cannot change it.
	//boolean DRIVE_FAST; if you do not initilaze compiler will ask you to initilaze it , because it s final.
	boolean DRIVE_FAST=true; // constant variables are written using uppercase.
	//by default compiler will add "public abstract" keywords.
	 void drive ();
	// public abstract void drive (); by default
	 
}
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
}

class Toyota extends Cars implements Drivable {  //in interface we can have MULTIPLE INHERITENCE, multiple parents.

	@Override
	//public void drive() { // this is final, you cannot change the visibility
	public void drive() {
		System.out.println("Toyota can drive");
		
	}  
	
}
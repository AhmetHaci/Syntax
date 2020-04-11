package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {
		// You cannot directly create and object of an abstarct (incomplete) class
		// Phone phone = new Phone (); C.E. cannot instanciate.

		// we can create it indirectly

		Phone phone = new Iphone();
		phone.playGames(); // this behavior comes from sub class
		phone.takePictures(); // this behavior comes from sub class
		phone.sendText(); // this behavior comes from base class
		phone.makeCall(); // this behavior comes from base class
	}
}

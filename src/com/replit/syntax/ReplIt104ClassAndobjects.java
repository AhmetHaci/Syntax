package com.replit.syntax;

class ReplIt104ClassAndobjects {

	String breed;
	String name;
	String color;

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}

	public static void main(String[] args) {

		ReplIt104ClassAndobjects dog1 = new ReplIt104ClassAndobjects();
		ReplIt104ClassAndobjects dog2 = new ReplIt104ClassAndobjects();
		ReplIt104ClassAndobjects dog3 = new ReplIt104ClassAndobjects();
		dog1.breed = "Husky";
		dog2.breed = "Bulldog";
		dog3.breed = "Labrador";
	
		dog1.bark();
		dog1.run();
		dog1.play();
		dog2.bark();
		dog2.run();
		dog2.play();
		dog3.bark();
		dog3.run();
		dog3.play();
	}

}

// Create a Class Main 
//
// In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
// Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
// The output of the program should be as following:
//  
// Husky can bark
// Husky can run
// Husky can play
// Bulldog can bark
// Bulldog can run
// Bulldog can play
// Labrador can bark
// Labrador can run
// Labrador can play
// 
// 
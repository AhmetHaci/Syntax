package com.syntax.class14;

public class DogTask2 {

	String breed;
	String color;
	String name;
	int age;
	
	void run() {
		System.out.println(breed + " can run ");
	}
	void bark () {
		System.out.println(breed + " barks when it sees strangers");
		
	}
	void play () {
		System.out.println(breed+" plays with you when you feel upset or bored");
	}

	
	
	public static void main(String[] args) {

		DogTask2 dog1 =new DogTask2 ();
		dog1.breed="Kangal";
		dog1.color="Yellow";
		dog1.name="Karabas";
		dog1.age=4;
		
		DogTask2 dog2 =new DogTask2 ();
		dog2.breed="Husky";
		dog2.color="Black and White";
		dog2.name="Kuchi";
		dog2.age=8;
		
		DogTask2 dog3 =new DogTask2 ();
		dog3.breed="Labrador";
		dog3.color="Brown";
		dog3.name="Zuzu";
		dog3.age=2;
		
		System.out.println("My dog is a "+dog1.breed+". His name is "+dog1.name+". He is "+dog1.color+". He is "+dog1.age+" years old.");
		dog1.run();
		dog1.bark();
		dog1.play();
		System.out.println();
		System.out.println("My dog is a "+dog2.breed+". His name is "+dog2.name+". He is "+dog2.color+". He is "+dog2.age+" years old.");
		dog2.run();
		dog2.bark();
		dog2.play();
		System.out.println();
		System.out.println("My dog is a "+dog3.breed+". His name is "+dog3.name+". He is "+dog3.color+". He is "+dog3.age+" years old.");
		dog3.run();
		dog3.bark();
		dog3.play();
		
		
	}

}

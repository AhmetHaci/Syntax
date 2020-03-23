package com.syntax.class14;

public class Dog { // this is class - template
	
	String breed;
	String color;
	String name;
	int age;



public static void main  (String []args) {
	
	Dog dog1= new Dog(); //this is object - example of class
	
	dog1.name="Jo";
	dog1.breed=" German Sheaperd";
	dog1.color="Yellow";
	dog1.age=10;
	dog1.eat();
	dog1.bark();
	dog1.run();
	
	System.out.println();
	
	Dog dog2=new Dog(); // this is example of class
	dog2.name="Mark";
	dog2.breed=" German Sheaperd";
	dog2.color="Yellow";
	dog2.age=10;
	dog2.eat();
	dog2.bark();
	dog2.run();
	
	
}

void eat () {
	System.out.println(name+ " can eat");
}
void bark() {
	System.out.println(name+" can bark");
}
void run () {
	System.out.println(name+" can run");
}
}
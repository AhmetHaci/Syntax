package com.syntax.class14;
 
public class PhoneTask1 {
 // primitive data types are 8 , but non primitive data  types are objects objects can be anything (String , car , dog, phone etc...
	String name;
	String country;
	int size;
	String color;
	int batterLife;

	void call() {
		System.out.println("my " + name + " can call people");
	}

	void connection() {
		System.out.println("my " + name + " can connect internet");
	}

	void send() {
		System.out.println("my " + name + " can send sms");
	}

	void camera() {
		System.out.println("my " + name + " can record video in high quality");

	}

	public static void main(String[] args) {
        //iphone is a reference variable
		PhoneTask1 phone1 = new PhoneTask1();
		phone1.name = "IPhone";
		phone1.country = "USA";
		phone1.size = 12;
		phone1.color = "white and black";
		phone1.batterLife = 48;
		phone1.call();
		phone1.camera();
		phone1.send();

		PhoneTask1 phone2 = new PhoneTask1();
		phone2.name = "Toyota";
		phone2.country = "Estima";
		phone2.size = 2020;
		phone2.color = "Yellow";
		phone2.batterLife = 32;

		PhoneTask1 phone3 = new PhoneTask1();
		phone3.name = "Honda";
		phone3.country = "Civic";
		phone3.size = 2006;
		phone3.color = "Grey";
		phone3.batterLife = 30;

		System.out.println(
				"My phone is an " + phone1.name + " my phone made in " + phone1.country + " it`s size is " + phone1.size
						+ " and it s color is " + phone1.color + " my phone battery life is " + phone1.batterLife+" hours");
		
		
		String str ="Hello friends";
		str=str.replace("Hello", "Welcome");
		System.out.println(str);
		

	}
}
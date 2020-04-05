package com.syntax.class23;
public class Car {
	String make;
	public Car(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("I have " + make);
	}

	public void start() {
		System.out.println(make+" starts by turning key ");
	}
}

class BMW extends Car {
	public BMW (String make) {
		super(make);
	}
	public void start () {
		System.out.println(make+" starts by pushing start button ");
	}
	
	public void GPS () {
		System.out.println(make + " has navigation system");
	}
}

class Mercedes extends Car {
	public Mercedes (String make) {
		super (make);
			}
	public void start () {
		System.out.println(make+" starts remotly");
	}
	public void lights () {
		System.out.println(make+" has pretty interior light");
	}
}
class Tesla extends Car {
	Tesla (String make) {
		super (make);
	}
		public void start () {
			System.out.println(make+" starts by voice command");
		}
	}

class Honda extends Car {
	Honda (String make){
		super (make);
		}
}	


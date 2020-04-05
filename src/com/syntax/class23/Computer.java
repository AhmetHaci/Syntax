package com.syntax.class23;

public class Computer {
	String brand;

	public Computer (String brand) {
		this.brand=brand;
	}
	public void operating() {
		System.out.println(brand + " has operation system");
	}
	public void play() {
		System.out.println(brand + " has music player");
}

public class Apple extends Computer {
   public Apple (String brand) {
	   super (brand);
   }
   public void operating() {
		System.out.println(brand + " has operation system by Apple company");
}
   public void play() {
		System.out.println(brand + " has IMusic App on desktop");
}
}

class Lenova extends Computer {

	public Lenova (String brand) {
		   super (brand);
	   }
	   public void operating() {
			System.out.println(brand + " has operation system by Microsoft");
	}
	   public void play() {
			System.out.println(brand + " plays musics with Windows Media Player");
	}
	}

class HP extends Computer {

	public HP (String brand) {
		   super (brand);
	   }
	   public void operating() {
			System.out.println(brand + " has operation system by Microsoft");
	}
	   public void play() {
			System.out.println(brand + " play videos with Winapp");
	}
	}

class Dell extends Computer {
	public Dell (String brand) {
		   super (brand);
	   }
	   public void operating() {
			System.out.println(brand + " has operation system by Microsoft");
	}
	   public void play() {
			System.out.println(brand + " music with Dell Music");
	}
	}
}
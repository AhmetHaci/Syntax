package com.syntax.class23;

public class ComputerTest {
	public static void main(String[] args) {
	
		Computer [] PC = {new Apple ("Apple Mac"), new Lenova ("Lenova PC "), new HP ("hp comp"), new Dell ("Dell notepad") };
		for (Computer pc: PC) {
			pc.operating();
			pc.play();
		}
	}

}

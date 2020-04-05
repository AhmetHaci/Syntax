package com.replit.syntax;

public class ReplIt148SiperKeyword {
	public static void main(String[] args) {
		Childs obj= new Childs ();
		Childs obj1= new Childs (10);
	}

	int num;

	ReplIt148SiperKeyword() {
		System.out.println("Parent Constructor without argument");
	}

	ReplIt148SiperKeyword(int num) {
		this.num = num;
		System.out.println(num);
	}
}

class Childs extends ReplIt148SiperKeyword {
	Childs() {
		System.out.println("Child Constructor without argument");

	}

	Childs(int num) {
		super(num);
	}
}
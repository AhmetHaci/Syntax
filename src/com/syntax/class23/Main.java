package com.syntax.class23;

public class Main {

	public static void main(String[] args) {

	
		Parent[] sub = { new Child1(), new Child2(), new Child3() };

		for (Parent p : sub) {
			p.hello();
		}
	}
}

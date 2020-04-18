package com.syntax.class27;

public class ReplIt165Abstract {
	public static void main(String[] args) {
		
	
	Parent obj = new Main ();
	obj.m1();
	obj.m2("m2");

	}

}

abstract class Parent {
	
	   public abstract void m1 ();
	   public abstract void m2 (String a);
	  
	  
	}
class Main extends Parent {

	@Override
	public void m1() {
		System.out.println("m1 without parameters");
		
	}

	@Override
	public void m2(String a) {
		System.out.println(a+" method with parameters");
		
	}
	
}
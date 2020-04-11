package com.syntax.class25;

public abstract class Vehicle1 {
	String name;
	Vehicle1 (String name){
		
	}

	public abstract void drive ();
	public abstract void stop ();
}
 class Bus extends Vehicle1{
	 Bus (String name){
		 super(name);
	 }

	@Override
	public void drive() {
		
		System.out.println(name+" drive");
		
	}

	@Override
	public void stop() {
		System.out.println(name+" Bus stop");
		
	}
	
}
class SchoolBus extends Bus {
	SchoolBus (String name){
		super(name);
	}
	
}

package com.syntax.class25;

public abstract class Vehicle1 {
	String name;
	Vehicle1 (String name){
		this.name=name;
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
		
		System.out.println(name+" drives");
		
	}

	@Override
	public void stop() {
		System.out.println(name+"  stops");
		
	}
	
}
class SchoolBus extends Bus {
	SchoolBus (String name){
		super(name);
	}
	
}

package com.sytntax.class18;

public class ConstroctorDemo {
	
	static String str="Hello";
	ConstroctorDemo(){
		System.out.println("i m your constructor");
		System.out.println("I am non arg constructir");
	}
	
	ConstroctorDemo(String str){
		System.out.println("I am a cons with 1 str parameter/args  "+"\n"+str);
	}
	ConstroctorDemo(int num){
		System.out.println("I am a cons with 1 int value = "+ num);
		
	}
	ConstroctorDemo (String str, int num) {
		System.out.println("I am constructor with two parameters: "+ str +num);
	}
	void ConstroctorDemo () {
		System.out.println("I do not know who I am");
	}
	
	public static void main(String[] args) {
		ConstroctorDemo obj = new ConstroctorDemo ();
		ConstroctorDemo obj1= new ConstroctorDemo ("Today is Java class");
		System.out.println(str);
		ConstroctorDemo obj2 = new ConstroctorDemo (12);
		ConstroctorDemo obj3 = new ConstroctorDemo ("Hello class" , 78);
		obj.ConstroctorDemo ();
	}
}

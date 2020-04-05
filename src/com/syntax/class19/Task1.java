package com.syntax.class19;

class Student  {
	String name;
	String address;
	
	Student ( String name, String address){
		this.name=name;
		this.address=address;
	}
	void showInfo () {
		System.out.println("student s name is "+name+" student`s address is "+ address);
	}
}

public class Task1 {
  


public static void main(String[] args) {
	Student obj = new Student ("Ahmet", "Atlanta");
	obj.showInfo();
}
}

//	Write program as a Student class   that has instance variables name and address.
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method
	
 


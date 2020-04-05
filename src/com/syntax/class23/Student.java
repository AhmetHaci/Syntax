package com.syntax.class23;

public class Student {
	
 public void study () {
	 System.out.println("Student study in the dorm");
	  }

 public void sleep () {
	 System.out.println("Students sleeps");
 }
 
 public void eat () {
	 System.out.println("Students eats");
 }
}

class SyntaxStudent extends Student{
	public void study () {             // Overrided method
		 System.out.println("Syntax students study  hard in next 4 months");
		}
	public void focus () {
		 System.out.println("Syntax students are focused on Java");
	 }
}
class CollegeStudent extends Student{
	public void study (String school, String str) {          // Overrided method
		school="Coolege";
		str="study";
		 System.out.println(school+" students "+str+" hard in next 4 months");
}
	public void play () {
		 System.out.println("Students play soccer");
}
}
class SchoolStudent extends Student{
	public void study (String name,int hour) {                  // Overrided method
		name="school";
	    hour=5;
		 System.out.println("Student study in the dorm "+hour+ "hours a day");
}

	public void hw () {
		 System.out.println("School students get HW 3 days a week");
}
	}
package com.syntax.class23;

public class Test {

	
	public static void main(String[] args) {
		
		Student syntax=new SyntaxStudent();
		syntax.eat();
		syntax.sleep();
		syntax.study();
		SyntaxStudent syntax1=new SyntaxStudent();
		syntax1.focus();
		
		Student collegeKid=new CollegeStudent();
		collegeKid.eat();
		collegeKid.sleep();
		collegeKid.study();
		CollegeStudent collegeKid1=new CollegeStudent();
		collegeKid1.play();
		
		
		
		Student schoolKid=new SchoolStudent();
		schoolKid.eat();
		schoolKid.sleep();
		schoolKid.study();
		SchoolStudent schoolKid1=new SchoolStudent();
		schoolKid1.hw();
	}
}

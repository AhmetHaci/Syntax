package com.syntax.class16;

public class Sofy {
	
	String title;
	int salary;
	static String CEO="Ali Tarlaci";
	String fullName;
	String state;
		public static void main(String[] args) {
			Sofy s1=new Sofy ();
			s1.fullName="Gulbahar.";
			s1.title="QA Tester";
			s1.salary=117000;
			s1.state="Washington";
			
			Sofy s2=new Sofy ();
			s2.fullName="Adile K.";
			s2.title="Product Owner";
			s2.salary=245500;
			s2.state="Indiana";
			
			Sofy s3=new Sofy ();
			s3.fullName="Gulsum Ince";
			s3.title="Java Developer";
			s3.salary=167000;
			s3.state="Texas";
			
			Sofy s4=new Sofy ();
			s4.fullName="Seyma Atasoy";
			s4.title="QA Tester";
			s4.salary=119000;
			s4.state="New Jersey";
			
			Sofy s5=new Sofy ();
			s5.fullName="Reyhan Barindik";
			s5.title="QA Tester";
			s5.salary=197000;
			s5.state="Florida";
			
			Sofy s6=new Sofy ();
			s6.fullName="Tugba Akca";
			s6.title="Java Developer";
			s6.salary=166000;
			s6.state="New Mexico";
		System.out.println("My name is "+s1.fullName+ " and my position at my company is "+s1.title+", my salary is "+s1.salary+". I live in "+s1.state+" and my CEO is "+Sofy.CEO);	
		System.out.println("My name is "+s2.fullName+ " and my position at my company is "+s2.title+", my salary is "+s2.salary+". I live in "+s2.state+" and my CEO is "+Sofy.CEO);
		System.out.println("My name is "+s3.fullName+ " and my position at my company is "+s3.title+", my salary is "+s3.salary+". I live in "+s3.state+" and my CEO is "+Sofy.CEO);
		System.out.println("My name is "+s4.fullName+ " and my position at my company is "+s4.title+", my salary is "+s4.salary+". I live in "+s4.state+" and my CEO is "+Sofy.CEO);
		System.out.println("My name is "+s5.fullName+ " and my position at my company is "+s5.title+", my salary is "+s5.salary+". I live in "+s5.state+" and my CEO is "+Sofy.CEO);
		System.out.println("My name is "+s6.fullName+ " and my position at my company is "+s6.title+", my salary is "+s6.salary+". I live in "+s6.state+" and my CEO is "+Sofy.CEO);
		}

}

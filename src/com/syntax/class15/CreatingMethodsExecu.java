package com.syntax.class15;

public class CreatingMethodsExecu {

	public static void main(String[] args) {
		CreatingMethods obj=new CreatingMethods ();
		char grade=obj.getGrade (15);
		 System.out.println(grade);
		 
		 if (grade=='A' || grade== 'B') {
			 System.out.println("Good job");
			 
		 }else {
			 System.out.println("Study more");
		 }
	}
}
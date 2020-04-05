package com.replit.syntax;

public class ReplIt144Test {
	
		
		 public static void main(String[]args){
			    Employee emp=new Employee();
			    Student student=new Student();
			    Retiree retiree=new Retiree();
			    emp.name="Joe";
			    emp.lastName="Smith";
			    emp.age=35;
			    emp.salary=35000;
			    
			    student.name="Adam";
			    student.lastName="Smith";
			    student.age=15;
			    student.grade=10;
			   
			    retiree.name="Frank";
			    retiree.lastName="Smith";
			    retiree.age=15;
			    retiree.seniorActivity="tour";
			    
			    emp.print1();
			    
			    student.print2();
			    
			    retiree.print3();
			    
			   
			  }
			}
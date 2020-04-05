package com.replit.syntax;


  class Person {
		String name;
		String lastName;
		int age;
	}

	class Employee extends Person {
		int salary;

		void print1() {

			System.out.println(name + " " + lastName + " " + age + " " + salary);
		}
	}

		class Student extends Employee {
			int grade;

			void print2() {
				
				System.out.println(name + " " + lastName + " " + age + " " +grade);
			}
		}
				class Retiree extends Student {
					String seniorActivity;

					void print3() {
						
						System.out.println(name + " " + lastName + " " + age + " " +seniorActivity);
					}
				}
			
		
	


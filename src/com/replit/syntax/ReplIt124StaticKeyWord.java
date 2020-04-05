package com.replit.syntax;

public class ReplIt124StaticKeyWord {

	
		  static String country, continent;

			static void display() {
				System.out.println(country+" located on "+continent+" continent");
			}
			
			public static void main(String[] args) {
				
				country="Morocco";
				continent="Africa";
				display();
					
			}
		}
package com.syntax.class05;

import java.util.Scanner;

public class AfterClassTask2 {

	public static void main(String[] args) {
		{
	        /*
	         * Take age input from a user and then based on the age print output if age from
	         * 0-3 --> you are a baby if age from 4-5 --> you are a kid if age from 6-12 -->
	         * you are a child if age from 13-19 --> you are teenager if age from 20-64 -->
	         * you are an adult if age is more or equal to 65 --> you are a senior
	         */
	        // 1 - let's declare all variables
	        int age;
	        Scanner scan;// to import we use mac: cmd+shift+o
	                        // windows : ctrl+shift+o
	        // 2. capture values
	        scan = new Scanner(System.in);
	        System.out.println("Please enter you are age");
	        age = scan.nextInt();
	        // 3. perform verification
	        String human;
	        
	        if (age < 3) {
	            human="baby";
	        } else if (age >= 3 && age <= 5) {
	            human="kid";
	        } else if (age >= 6 && age <= 12) {
	            human="child";
	        } else if (age >= 13 && age <= 19) {
	            human="teenager";
	        } else if (age >= 20 && age < 65) {
	            human="adult";
	        } else {
	            human="senior";
	        }
	        
	        System.out.println("You are a "+human);
	        
	        if (human.equalsIgnoreCase("baby")){
	        	System.out.println("Your house is full of joy");
	        }
	        
	        if (human.equalsIgnoreCase("teenager")) {
	            System.out.println("Parents good luck");
	        }if (human.equalsIgnoreCase("child")) {
	            	System.out.println("Your expenses getting higher");
	        }if(human.equalsIgnoreCase("adult")) {
	System.out.println("You are on your own");
	        }if (human.equalsIgnoreCase("senior")) {
		System.out.println("Do not forget to take your pills");
	        }if (human.equalsIgnoreCase("kid")){
	        	System.out.println("don t break things");
	        }
		
		}
	}
	           }

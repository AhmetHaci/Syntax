package com.replit.syntax;

import java.util.Scanner;

public class ReplIt40SwicthStatement {

	public static void main(String[] args) {
//		By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
//
//		First Output: "Enter name of the instructor"
//
//		case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
//		case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
//		case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//		case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//
//		Other than these four names if the user provides any other names --> " Invalid instructor selected"

	
	Scanner scan=new Scanner (System.in);
	
	String defination;
	System.out.println("Enter name of the instructor");
	String name=scan.nextLine();
	
	switch (name) {
	case "Shiva":
		defination="Will take care of Java Assignment";
		break;
	case "Sandish":
		defination="Will take care of SDLC Assignment";
		break;
	case "Weqas":
		defination="Will take care of Selenium Assignment";
		break;
	case "Asel":
		defination="Will take care of every Assignment";
		break;
		default:
			defination="Invalid instructor selected";
	}
	System.out.println(defination);
	}

}

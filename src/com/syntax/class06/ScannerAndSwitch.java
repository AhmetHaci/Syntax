package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		/* ask user a gender m or f
		 * based on gender will  provide description 
		 */
	Scanner scan=new Scanner (System.in);
	char gender;
	String gType;
	
	System.out.println("Please enter your gender:  M or F ");
	gender=scan.next().charAt(0);
	//1 no relational (>,<,<= ,>= etc.. ) or logical operators () can be used ( &&, || , !) cannot be used.
	// switch case works only with byte, short, char, int and String.
	//in swicth case we cannot have duplicate case. we must use break.
	switch (gender) {
	case 'M':
		gType="Male";
		break;
	case 'F':
		gType="Female";
		break;
		default:
			gType="Unknown";
	}
	System.out.println("Your gender is "+ gType);
	}

}

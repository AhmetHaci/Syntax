package SyntaxTasks;
import java.util.Scanner;
public class Task16 {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 Scanner atl=new Scanner (System.in);
 
 System.out.println("What is the number of the years you have worked with us ?");
	int respond=atl.nextInt();
	
	if (respond>5) {
		System.out.println("You are eligible for bonus !");
		
		System.out.println("What is your salar ?");
		int respond2=atl.nextInt();
		
		if (respond2>50000) {
			System.out.println("You have bonus of $5000 ");
		}else {
			System.out.println("You have bonus of $3000 ");
		}
		
	}else {
		System.out.println("You are ineligible for bonus !");
	}
	
	
	}

}

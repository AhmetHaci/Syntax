package SyntaxTasks;
import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
		//Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, 
		//you should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .

		Scanner atl=new Scanner (System.in);
		
	System.out.println("Do you have a diploma ? ");
	String answer=atl.nextLine();
	
	if(answer.equalsIgnoreCase ("Yes")) {
		System.out.println("Congratulations !");
		
		System.out.println("What is your GPA score? ");
		double answer2=atl.nextDouble();
		if (answer2>3) {
			System.out.println("you are eligible for scholarship");
		}else {
			System.out.println("You should study harder ! ");
		}
		
	}else {
		System.out.println("You should get a degree!!!");
	}
	
	}

}

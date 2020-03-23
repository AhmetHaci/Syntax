package SyntaxTasks;
import java.util.Scanner;
public class Task15 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? 
		//If balance of the card is larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.
 
		Scanner atl=new Scanner (System.in);
		System.out.println("Do you have a credit card?");
	    String answer=atl.nextLine();
	    
	    if(answer.equalsIgnoreCase ("Yes")) {
	    	
	    System.out.println("What is your balance? ");
	    int balance=atl.nextInt();
	    
	    if (balance>1000) {
	    	System.out.println("You should pay off immediatelly !");
	    }else {
	    	System.out.println("You can spend more");
	    }
	    
	    }else {
	    	System.out.println("Would you like to get a credit card from us ?");
	    	String answer2 = atl.nextLine();
	    	
	    	if (answer2.equalsIgnoreCase("Yes")) {
	    		System.out.println("What is your social security number");
	    		int respond3=atl.nextInt();
	    	}else {
	    		System.out.println("Thank you for visiting us");
	    	}
	    }
	
	}

}

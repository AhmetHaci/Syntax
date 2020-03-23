package SyntaxTasks;
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less than 200,000 then you would lend the money otherwise you would reject the client.

		
		Scanner atl=new Scanner(System.in);
		
		System.out.println("What is the amount of the loan you needed? ");
        int respond =atl.nextInt();
        
        if(respond<200000) {
        	System.out.println("I will lend you money");
        }else {
        	System.out.println("I am sorry your request declined!");
        }
	}

}

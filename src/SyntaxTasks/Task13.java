package SyntaxTasks;
import java.util.Scanner;
public class Task13 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
Scanner atl=new Scanner (System.in);

System.out.println("how old are you ?");
	int age=atl.nextInt();
	
	if (age>18) {
		System.out.println("I will issue you a driver licence");
	}else {
		System.out.println("You should get a learner`s permit !");
	}
	
	}

}

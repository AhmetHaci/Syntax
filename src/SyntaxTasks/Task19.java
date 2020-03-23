package SyntaxTasks;
import java.util.Scanner;
public class Task19 {

	public static void main(String[] args) {
		// Create a Java program and store values of mortgage rate and mortgage price. 
				//First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
		//Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
Scanner atl=new Scanner (System.in);

System.out.println("What is the mortgage rate ? ");
double mR=atl.nextDouble();

 if(mR > 4.5) {
	 System.out.println("You cannot buy the house!");
 }else {
	 System.out.println("You can buy the house");
	 
	 System.out.println("What is your house price ?");
	 double mP=atl.nextDouble();
	 
	 if(mP>200000) {
		 System.out.println("You will need to take a loan!");
	 }else {
		 System.out.println("You can pay cash !");
	 }
	 
 }

	}

}

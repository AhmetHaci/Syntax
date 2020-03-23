package SyntaxTasks;

public class Task11 {

	public static void main(String[] args) {
		// Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
//Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.

 double	mR=4.1;
 int mP=185000;
 
 if (mR>4.5) {
	 System.out.println("I cannot buy the house");
 }else {
	 System.out.println("I will buy the house");
  if (mP>200000) {
	  System.out.println("I need to take a loan");
  }else {
	  System.out.println("I will pay cash");
  }
 
 }
	
	}

}

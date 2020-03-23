package com.syntax.class04;
public class NestdInClassTask {

	public static void main(String[] args) {
		boolean diploma= false;
		double gpa=2.5;
		
		
		//Write a program to store a boolean value of whether user has diploma or not. 
		//If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		//Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say
		//“You are eligible for scholarship”, otherwise → “You should have studied harder” .package com.syntax.class04;

		if (diploma) {
			System.out.println("Congrats");
			
			if (gpa >=3.5) {
				System.out.println("You ar eligible for scholarship");
			}else { 
					System.out.println("You should study harder");
				
			}
		}else { 
			System.out.println("You should get a degree");
		}

	}

}


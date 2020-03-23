package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		//if student completed the quiz we will check for score
//if score > 90  great job
		//if score is >80  well done
		// if score is 70> you could have done better
		//if did not completed the quiz too bad
	
	boolean quiz = true;
	int score = 87;
	
	if (quiz) {
		System.out.println("We will check your score");
		
		if (score>90 && score<=100) {
			System.out.println("Great Job !!!");
		 }else if (score >80) {
				System.out.println("Well done !!!");
		 }else if (score> 70 ) {
					System.out.println("You could have done better !");
		 } else if (score < 70) {
						System.out.println("You failed ! ");
					}
			
	}else {
		System.out.println("Please do your quiz");
	}
	
	}
		 
}


package com.syntax.class08;

public class AselReviewBreakAndConitune {

	public static void main(String[] args) {
		// numbers from to  1 to 20 but skip 5 6 7 
		
		for (int i=1;i<=20;i++) {
			if (i==5|| i==6|| i==7) {
				continue;
				
			}
			System.out.println(i);
		}
 
	}

}

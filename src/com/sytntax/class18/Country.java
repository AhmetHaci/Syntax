package com.sytntax.class18;

public class Country {
// create vairable to hold state and capital of the state
	String state, stateCapital;
	
	public  void display () {
		System.out.println("Given state is "+ state +" and it s capital is "+ stateCapital);
	}
	public Country  (String usaState, String usaStateCapital) {
		state=usaState;
		stateCapital=usaStateCapital;
	}
		public static void main (String [] args) {
		
			Country usa = new Country ("Virginia", "Richmond");
			usa.display();
			
		}
	}


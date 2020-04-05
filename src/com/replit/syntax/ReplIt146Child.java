package com.replit.syntax;

class ReplIt146Child extends ReplIt146SuperkKeyword {
     
	String state;

	ReplIt146Child(String city,String state,String continent) {
		super(city,continent);
		this.state=state;
		
	}
	void display() {
		
		System.out.println(city+state+continent);
	}
}

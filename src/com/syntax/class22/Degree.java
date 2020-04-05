package com.syntax.class22;

public class Degree {

	public void getPrerequisite () {
		System.out.println( "To get a degree you need high school diploma");
	}
}

class Bachelors extends Degree{
	
}
class Masters extends Degree{
	public void getPrerequisite () {
		System.out.println( "To get a master you need college degree");

	}
}
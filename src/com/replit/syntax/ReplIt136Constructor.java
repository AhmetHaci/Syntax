package com.replit.syntax;

public class ReplIt136Constructor {
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	
	public void display ( ) {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	
	}
	ReplIt136Constructor (){
		this.schoolName=schoolName;
		this.batch=batch;
		
	}
ReplIt136Constructor (String schoolName, int batch, String lastDayOfClass, int year){
	this.schoolName=schoolName;
	this.batch=batch;
	this.lastDayOfClass=lastDayOfClass;
	this.year=year;
		
	}
public static void main(String[] args) {
	ReplIt136Constructor ali = new ReplIt136Constructor ();
	ali.display();
	ReplIt136Constructor veli= new ReplIt136Constructor("Syntax ",6, "07/30/2020",2020);
	veli.display();
	
}

}

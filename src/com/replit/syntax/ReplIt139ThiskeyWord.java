package com.replit.syntax;

public class ReplIt139ThiskeyWord {
String dogName;
double dogWeight;
static String dogBreed="Mutt";

 public void display () {
	 this.dogName=dogName;
	 this.dogWeight=dogWeight;
	 System.out.println(dogName+ " "+ dogWeight);
 }



public static void main(String[] args) {
	ReplIt139ThiskeyWord dog1 = new ReplIt139ThiskeyWord ();
	dog1.dogName="Tarzan Mutt";
	dog1.dogWeight=50.0;
	dog1.display();
	
	ReplIt139ThiskeyWord dog2 = new ReplIt139ThiskeyWord ();
	dog2.dogName="Lucy Mutt";
	dog2.dogWeight=10.0;
	dog2.display();
}
}
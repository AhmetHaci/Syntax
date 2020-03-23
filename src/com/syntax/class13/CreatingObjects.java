package com.syntax.class13;

public class CreatingObjects {
	public static void main (String []args) {
	JavaGroup amazingCoders= new JavaGroup();
		JavaGroup weCode = new JavaGroup ();
		weCode.members=8;
		weCode.averageAge=19;
		weCode.ExpectedStudyTime=15;
		weCode.actualStudyTime=23;
				
		amazingCoders.members=36;
		amazingCoders.averageAge=22;
		amazingCoders.ExpectedStudyTime=15;
		amazingCoders.actualStudyTime=18;
		System.out.println("Java group Amazing Coders  has "+ amazingCoders.members+" members.");
		System.out.println("Java group Amazing Coders average age is "+amazingCoders.averageAge+".");
		System.out.println("Java group Amazing Coders expected study time is "+amazingCoders.ExpectedStudyTime+" hours.");
		System.out.println("Java group Amazing Coders actual study time is "+amazingCoders.actualStudyTime+" hours.");
		System.out.println("                       ");
		System.out.println("Java group We Code  has "+ weCode.members+" members.");
		System.out.println("Java group We Code  average age is "+weCode.averageAge+".");
		System.out.println("Java group We Code  expected study time is "+weCode.ExpectedStudyTime+" hours.");
		System.out.println("Java group We Code  actual study time is "+weCode.actualStudyTime+" hours.");
	}
}
class JavaGroup {
	int members;
	int averageAge;
	int ExpectedStudyTime;
    int actualStudyTime;}
        


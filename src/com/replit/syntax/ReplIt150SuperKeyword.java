package com.replit.syntax;
//Create class A
//declare variable int i=10;
//
//Create class B  extends A
//declare variable int i=20;
//
//create a method to display value of variable i from both classes
//
//In Main Class create an object of subclass and call method display
//
//Expected Output:
//20
//10
class ReplIt150SuperKeyword {
  	public static void main(String[] args) {

		Z obj = new Z();
		obj.display();
		obj.display1();
	}

class A {
	int i = 10;

	public void display1() {
		System.out.println(i);
	}
}

class Z extends A {
     
    	int i = 20; 
     
	

	public void display() {
		System.out.println(i);
	}

}
}



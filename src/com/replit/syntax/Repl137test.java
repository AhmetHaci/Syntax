package com.replit.syntax;

public class Repl137test {

	public static void main(String[] args) 
	{
	  
		ReplIt137Constructor c1 = new ReplIt137Constructor("Toyota","Prius",4,120,30000);
		ReplIt137Constructor c2 = new ReplIt137Constructor("Toyota","Prius",120,30000);
		ReplIt137Constructor c3 = new ReplIt137Constructor(4,120,30000);
		ReplIt137Constructor c4 = new ReplIt137Constructor("Toyota","Prius",4);
  c1.display();
  c2.display();
  c3.display();
  c4.display();
	}
}
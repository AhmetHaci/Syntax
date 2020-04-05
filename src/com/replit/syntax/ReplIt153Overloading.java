package com.replit.syntax;

public class ReplIt153Overloading {
	
		  void m (int a ){
		    System.out.println(a);
		  }
		  void m (String b ){
		    System.out.println(b);
		  }
		void m (double c ){
		    System.out.println(c);
		  }
		public static void main (String [] args){
			ReplIt153Overloading obj1= new ReplIt153Overloading ();
		  obj1.m (100);
		  
		  obj1.m("Syntax Technologies");
		 
		  obj1.m(100.09);
		}
		}


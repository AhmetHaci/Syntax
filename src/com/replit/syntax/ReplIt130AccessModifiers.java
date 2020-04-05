package com.replit.syntax;

public class ReplIt130AccessModifiers {
	private void privateCall () {
		System.out.println("This is Private Method");
	}
	
	 void defaultCall () {
		System.out.println("This is Default Method");
	}
	protected void protectedCall () {
		System.out.println("This is Protected Method");
	}
	public void publicCall () {
		System.out.println("This is Public Method");

}
	public static void main(String[] args) {
		ReplIt130AccessModifiers  answ= new ReplIt130AccessModifiers ();
		answ.defaultCall ();
		answ.protectedCall ();
		answ.publicCall ();
		answ.publicCall ();
		
	}
}

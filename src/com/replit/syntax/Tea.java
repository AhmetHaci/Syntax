package com.replit.syntax;

public abstract class Tea {
	String teaType;
	Tea (String teaType) {
		this.teaType=teaType;
	}
	public abstract void addSugar ();
}

class LemonTea extends Tea{

	LemonTea(String teaType) {
		super(teaType);
		
	}

	@Override
	public void addSugar() {
		System.out.println("for " + teaType + " we need 2 spoons of sugar");	
	}
	
}
class ChaiTea extends Tea {

	ChaiTea(String teaType) {
		super(teaType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSugar() {
		System.out.println("for " + teaType + " we need 1 spoon of sugar");
		
		
	}
	
}

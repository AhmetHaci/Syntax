package com.syntax.class29;

import java.util.ArrayList;



public abstract class Insurance {
	String InsuranceName;
	Insurance (String InsuranceName){
	this.InsuranceName=InsuranceName;
	}
	
	
	

	 public abstract void getQuote();
	 public abstract void CancelInsurance ();
	
}
class Car extends Insurance{
	String carModel;
	Car (String InsuranceName , String carModel){
		super (InsuranceName);
		this.carModel=carModel;
		
	}

	@Override
	public void getQuote() {
		System.out.println(InsuranceName + " is an affordable insurance company for your "+ carModel);
		
	}

	@Override
	public void CancelInsurance() {
		System.out.println("You can cancel your insurance any time at "+ InsuranceName+" for your "+carModel);
		
	}
	
}
class Pet extends Insurance {
	String petType ;
	Pet(String InsuranceName,String petType) {
		super(InsuranceName);
		this.petType=petType;
	}
	
	
		
	
	@Override
	public void getQuote() {
		System.out.println(InsuranceName + " has new deal for your  "+ petType);
		
	}
	@Override
	public void CancelInsurance() {
		System.out.println("To cancel your insurance on "+ petType+" you can call "+InsuranceName+" on 1800 986 54 54 " );
		
	}
}
class Health extends Insurance {
	
	
Health(String InsuranceName) {
		super(InsuranceName);
		
	}



@Override
public void getQuote() {
	System.out.println("I enrolled "+InsuranceName + " this year. ");
	
}

@Override
public void CancelInsurance() {
	System.out.println("I cannot cancel my insurance off the season  at "+ InsuranceName);
	
}
}
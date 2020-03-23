package com.syntax.class04;

public class NestedInClass {

	public static void main(String[] args) {
		//chechk if patiens has any allergies
		//if no allergies ---> you are healty
		//otherwise chechk the patient has: orange allergy do not eat oranges
		//apple allergies --> do not eat apples
        // kiwi allergies --> do not eat kiwi
		
		boolean allergy=true;
		boolean oranges=true;
		boolean apple = false;
		boolean kiwi= false;
		
		if (allergy) {
			System.out.println("we need to do allergy test");
			 if (oranges) {
			System.out.println("Do not eat oranges");}
		
		 if (apple) {
			System.out.println("do not eat apple");}
		
		
		 if(kiwi) {
		 System.out.println("do not eat kiwi");}
	 
		}else {
		System.out.println("you are healty");
	}

		}
		}
		



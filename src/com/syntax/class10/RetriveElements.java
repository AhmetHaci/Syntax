package com.syntax.class10;

public class RetriveElements {

	public static void main(String[] args) {
		char[] letters2 ={ 'A','B','C','D','E','F'};
		for (int i=0;i<letters2.length;i++) {
			System.out.print(letters2[i]+" ");	
		}
		
		System.out.println(" Printing using Advance Loops");
		
		for (char grade:letters2) {
			System.out.println(grade+" ");
		}
	//create an array of fruits and retrive all elements
		String[] fruits= {"Banana","Kiwi","Apple","Mango"};
		//advance for loop, enhanced for loop, for each loop
		for (String fruit: fruits) {//advance for loop
			if (fruit==("Apple")){ // for (type: name of array )
				System.out.println(fruit+" is your favorite fruite");
			}else {
				System.out.println(fruit+" is not your favoriye fruite");
			}
			System.out.println(fruit);
		}
		System.out.println("=regular for loop");
		for (int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
			
		}
	}

}

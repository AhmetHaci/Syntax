package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).
	String[] weCode= new String [9];
	weCode[0]="mrSerhan";
	weCode[1]="Kurt";
	weCode[2]="Ayse Ozkan";
	weCode[3]="Cigdem Yasan";
	weCode[4]="Gulbahar";
	weCode[5]="Medine";
	weCode[6]="Servet";
	weCode[7]="Tugba Akca";
	weCode[8]="Ahmet";
	System.out.println(weCode[8]);
	
	System.out.println("=========2nd Way=======");
	String [] weCode1={"mrSerhan","Kurt","Ayse","Cigdem","Gulbahar","Medine","Servet","Tugba","Ahmet"};
	System.out.println(weCode1[8]);
	}
}

package com.sytntax.class18;

public class Task4 {
//	Write a program  that will have 4 different access
//	levels of constructors and create 3 objects of this class: 
//		1 - inside same class; 2 - from outside the class; 3 - from different class inside different package 
//		and observe result.
//
//
//	Write program that have static constructor and observe result.

Task4 (){
	System.out.println("default cons");
}
public Task4 (String a) {
	System.out.println("public cons with a param" + a);
}

protected Task4(int a, String b) {
	System.out.println("protected cons with two variables "+ a+b);
	
}

private Task4(String x, String y , int t) {
	System.out.println("Private cons with 3 param "+ x+y+t);
}
public static void main(String[] args) {
	Task4 obj1=new Task4("Ali ", " Veli ", 5) ;
}
}

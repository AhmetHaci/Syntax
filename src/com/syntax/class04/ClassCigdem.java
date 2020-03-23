package com.syntax.class04;
import java.util.Scanner;
public class ClassCigdem {

	public static void main(String[] args) {
    Scanner atl=new Scanner(System.in);

    System.out.println("Please enter your age");
    int age=atl.nextInt();
 
    if(age>25){
  	System.out.println("Please enter your gender:M or F");
    String gender = atl.next();

    if (gender.equalsIgnoreCase("M")) {
	System.out.println("Man");
}else {
	System.out.println("Woman");
}
}else  {
   System.out.println("Please enter your gender:M or F");
  String gender = atl.next();
if (gender.equalsIgnoreCase("M")){
	System.out.println("Boy");
}else{
	System.out.println("Girl");
}
}
}
}



	  
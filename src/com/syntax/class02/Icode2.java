package com.syntax.class02;
import java.util.Scanner;
public class Icode2 {

	public static void main(String[] args) {
		String username= "excalibur";
        String password = "1453";
                
        
        Scanner atl = new Scanner (System.in);
        
        System.out.println("Please enter your username ");
        String userName=atl.nextLine();
        
        System.out.println("Please enter your password ");
        String passWord = atl.nextLine();
        
        if (!(username.equals(userName)) && !(password.equals(passWord))){
            System.out.println("You entered wrong username and password");
        

     }        else if ((username.equals(userName)) && !(password.equals(passWord))){
         System.out.println("You entered wrong password");
     }
        else if (!(username.equals(userName)) && (password.equals(passWord))){
            System.out.println("You enterd wrong username");
        }
            
        else 
        System.out.println("Access granted");
    }
        
}

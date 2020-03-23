package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		double sale;
		double comission;
 		System.out.println("How much your sales are? ");
        sale=scan.nextDouble();
		
         
         if (sale>=1 && sale<=100) {
        	 //give user %10 comission
        	 //System.out.println("Based on your sales your comission is= "+ (sale*0.1));
        	 comission=sale*0.10;
        	
         }else if( sale>=101 && sale<=200) {
        	 //give user %20 comission
        	 comission=sale*0.20;
        	 
         }else if (sale >200 && sale<=500) {
        	 //if sale %30 give user % 30
        	 comission=sale*0.30;
        	
        	}else {
        		//give user  %50
        		comission=sale*0.50;
        		
        
        	}
	
System.out.println("Based on your sales, your comission is= " + comission);
	}

}


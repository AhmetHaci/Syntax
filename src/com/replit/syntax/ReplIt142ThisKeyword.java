package com.replit.syntax;

public class ReplIt142ThisKeyword {
	String item;
	double price; 
	double quantity;
	
	public ReplIt142ThisKeyword (String item, double price, double quantity){
	    this.item = item; 
	    this.price = price; 
	    this.quantity = quantity; 
	  }
	
	public double ItemTotalPrice(){
	    double totalPrice = this.price * this.quantity ; 
	    
	    System.out.println(this.item + " Total Value " + totalPrice);
	    
	    return totalPrice;
	  }
	}
	

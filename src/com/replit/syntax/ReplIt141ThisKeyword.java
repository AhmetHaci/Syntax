package com.replit.syntax;

public class ReplIt141ThisKeyword {
	String model;
	double price;
	double quantity;

	public ReplIt141ThisKeyword(String model, double price, double quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	public void carStockValue() {

		double stockValue = this.price * this.quantity;

		System.out.println(model + " Stock Value " + stockValue);
	}

}
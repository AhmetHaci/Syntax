package com.replit.syntax;

public class ReplIt138Constructor {
	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;

	ReplIt138Constructor(String labell, int pricee, String categoryy, boolean hasExpirationn, int stockk) {
		label = labell;
		price = pricee;
		category = categoryy;
		hasExpiration = hasExpirationn;
		stock = stockk;

	}

	ReplIt138Constructor(String labell, int pricee, int stockk) {
		label = labell;
		price = pricee;
		category = "misc";
		hasExpiration = false;
		stock = stockk;
	}

	ReplIt138Constructor(String labell, int pricee) {
		label = labell;
		price = pricee;
		stock = 0;
	}

	void display() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}
}

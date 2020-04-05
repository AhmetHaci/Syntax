package com.replit.syntax;

public class ReplIt142Test {

	String item;
	double price;

	public static void main(String[] args) {
		ReplIt142ThisKeyword obj = new ReplIt142ThisKeyword("Blanket", 49.99, 2);
		ReplIt142ThisKeyword obj1 = new ReplIt142ThisKeyword("Mattress", 219.59, 2);
		double blanketTotalPrice = obj.ItemTotalPrice();
		double mattressTotalPrice = obj1.ItemTotalPrice();
		double sumPurchase = blanketTotalPrice + mattressTotalPrice;

		System.out.println("You purchased " + sumPurchase + " Today");
	}

}

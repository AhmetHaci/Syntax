package com.syntax.class28;

public abstract class Card {
	String cardType;

	Card(String cardType) {
		this.cardType = cardType;
	}

	public abstract void creditLimit();

	public void cashBack() {
		System.out.println(cardType + " gives you cash back of %3");
	}

}

class Visa extends Card {

	Visa(String cardType) {
		super(cardType);

	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $2500.00");

	}

}

class AmericanX extends Card {

	AmericanX(String cardType) {
		super(cardType);
		
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $2000.00");

	}

}

class Master extends Card {

	Master(String cardType) {
		super(cardType);

	}

	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the " + cardType + " is $2000.00");

	}

}
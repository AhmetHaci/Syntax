package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {
		LinkedList<Card> myList = new LinkedList<>();
		myList.add(new Visa("Visa"));
		myList.add(new AmericanX("Amex"));
		myList.add(new Master("Master"));
System.out.println("Iterator");
		Iterator<Card> cardIt = myList.iterator();
		while (cardIt.hasNext()) {
			Card mycc = cardIt.next();
			mycc.cashBack();
			mycc.creditLimit();
		}
		System.out.println("Advance Loop");
		for (Card l : myList) {
			l.cashBack();
			l.creditLimit();
		}
		System.out.println("Regular For Loop");
		for (int i=0; i<myList.size();i++) {
			myList.get(i).cashBack();
			myList.get(i).creditLimit();
		}
	}

}

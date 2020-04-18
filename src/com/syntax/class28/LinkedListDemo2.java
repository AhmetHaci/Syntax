package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

class Sweets {
	String name;
	
	public Sweets (String name) {
		this.name=name;
		
	}
	public void Ilove () {
		System.out.println("I love "+name );
	}
}



public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList <Sweets> sweetie =new LinkedList ();
		sweetie.add(new Sweets ("Cake"));
		sweetie.add(new Sweets ("Chocolatte"));
		sweetie.add(new Sweets ("Cookies"));
		sweetie.add(new Sweets ("Macarons"));
		
		//display
		for (Sweets el :sweetie) {
			System.out.println(el.name);
			el.Ilove();
		}
		
		Iterator <Sweets>obj= sweetie.iterator();
		while (obj.hasNext()) {
			Sweets mySweets=obj.next();
			System.out.println(mySweets);
		}
		

	}

}




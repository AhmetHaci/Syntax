package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class InstructorList {

	public static void main(String[] args) {
		List <Instructor>myList=new ArrayList<>();
		myList.add(new Instructor ("Fazilet" , "Kacmaz"));
		myList.add(new Instructor ("Bulent" , "Sahinkayasi"));
		myList.add(new Instructor ("Memik" , "Gok"));
	    
		for (Instructor newList : myList) {
			newList.display();
			
		}

	}

}

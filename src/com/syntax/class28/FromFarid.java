package com.syntax.class28;

import java.util.ArrayList;

public class FromFarid {

	public static void main(String[] args) {
		   ArrayList<String> iList= new ArrayList();
		   iList.add("Farid");
		   iList.add("Saif");
		   iList.add("Aaron");
		   iList.add("Ismail");
		   iList.add("Brian");
		   iList.add("Turker");
		   iList.add("Al");
		   //remove names shorter than 5 char
		   for ( int i =0;i<iList.size();i++ ) {
		     if ( iList.get(i).length()<=5) {
		      iList.remove(i);
		     }
		   }
		   System.out.println(iList);
		  }
		}
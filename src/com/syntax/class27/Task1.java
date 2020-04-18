package com.syntax.class27;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		          //Generic ArrayList  
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("Ahmet");
		arrayList.add("Hassna");
		arrayList.add("Tugba");
		arrayList.add("Kemal");
		arrayList.add("Gulbahar");
		
		System.out.println(arrayList.isEmpty());
		
		System.out.println(arrayList.size());
		for (String list:arrayList) {
			System.out.print(list+" ");
		}
		
	
	System.out.println();

	//non generic arrayList
	ArrayList<Object> Alist=new ArrayList<>(); // we can do both ways
	//ArrayList alist=new ArrayList(); // we can do both ways
	Alist.add("Hello");
	Alist.add(100);
	Alist.add(10.99);
	Alist.add(true);
	Alist.add('c');
	//alist.get(1)+alist.get(2)); will be C.E. ASK TYPECAST
	System.out.println(Alist);
	
	}
	
	
}

package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap1 {

	public static void main(String[] args) {
		//arrays list that store numbers
		ArrayList <Integer> num=new ArrayList<>();
		num.add(1);
		num.add(10);
		num.add(100);
		num.add(1000);
		System.out.println(num.size());
		//add more 
		num.add(10000);
		//remove
		num.remove(2);
		System.out.println(num);
     //retrieve value from an arraylist
		int element=num.get(0);
		System.out.println(element);
        System.out.println(num.get(2));
        for ( int i=0; i<num.size();i++) {
        	System.out.print(num.get(i)+" ");
        }
        System.out.println();
        for(int myNum :num) {
        	System.out.print(myNum +" ");
        }
        System.out.println();
        //how to print numbers backward
        for (int i =num.size()-1;i>=0;i--){
        	System.out.print(num.get(i)+" ");
        }
        //backward with enhanced loops
        // :) it s not possible 
        
        System.out.println("Using iterator");
        
        //3 using Iterator
        Iterator<Integer> iterator=num.iterator();
        while (iterator.hasNext()) {
        	System.out.print(iterator.next()+" ");//auto unboxing
        }
        
        
        	}

}

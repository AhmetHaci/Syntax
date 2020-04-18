package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListRepl {
	
	
	 public static void main(String[] args) {

			ArrayList<Integer> list = new ArrayList<>();
			
			list.add(4);
			list.add(62);
			list.add(8);
			list.add(5);
			list.add(4);
			
			
			for (Integer myArr:list) {
				System.out.print(myArr+" ");
			}
			
		}
	}
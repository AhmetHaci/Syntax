package com.replit.syntax;

public class ReplIt134AccessModifiers {
	public static String maxLength(String[] array) {
	      int max = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > max) {
	              max = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  
	}

		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		
	}
package com.replit.syntax;

import java.util.Arrays;

class TubaAbla {
	public static void main(String[] args){
        String watchString = "hello";
        int j;
        char temp;

        char[] chars = watchString.toCharArray();

        for (int i = 0; i <chars.length; i++) {

            for ( j = 0; j < chars.length; j++) {

                if(chars[j]>chars[i]){
                    temp=chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }

            }

        }

        for(int k=0;k<chars.length;k++){
            System.out.print(chars[k]);
        }

	}
}
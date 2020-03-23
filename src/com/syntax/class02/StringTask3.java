package com.syntax.class02;

public class StringTask3 {

	public static void main(String[] args) {

        //Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. 
        //“The perimeter of a rectangle with width ___ and height ____ is equal to _____and the area is __”
        
             int width=5;
             int height=8;
             int answer=width*height;
             int perimeter= 2*(width+height);
             
             
        
        System.out.println("The perimeter of a rectangle with width "+ width +" and height "+ height +" is equal to "+ perimeter+" and the area is "+ answer);
    }
}



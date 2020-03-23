package com.syntax.class10;

public class TwoDMonths {

	public static void main(String[] args) {
		String [][] months= { { "December","January","Februar"}, {"March","April","May"},{"June","July","August"},{"September","October"
			,"November"}};
		
	System.out.println(months.length);//how many arrays we do have shows down
		//System.out.println("Your months is " + months[0][1]);
	
	int rows=months[0].length; // how many arrows
	int firstArray=months[3].length;
	System.out.println(firstArray);
	}

}

package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {

		int[] grades = new int[4];
		grades[0] = 90;
		grades[1] = 67;
		grades[2] = 89;
		grades[3] = 78;
		// what s the average
int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
	System.out.println("Average grades i "+ average);
	System.out.println("=========shorter way================");
	
	String [] cities ={"Washington DC","New York","Paris","Miami",
			"Dallas","Chantilly","Los Angeles"};
	//i live in Paris
	System.out.println("I live in "+cities[2]);
	int x=1;
	System.out.println("i MOVED TO" + cities[x]);
	x+=3;
	System.out.println(cities[x]);
	
	//how many elements stored in array?
	int arraySize=cities.length;//7
	System.out.println("Total elements "+ arraySize );
	
	
	//how can we acces last element from an array
	System.out.println(cities[arraySize-1]);
	System.out.println("*************");
	
	//access all elements from an array with for loop
	for (int i=0;i<arraySize;i++) {
		System.out.print(cities[i]+" ");
		
	}
	}
	}

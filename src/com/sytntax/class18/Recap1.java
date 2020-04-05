package com.sytntax.class18;

public class Recap1 {

	
	//sum of array practice 
	public int sumOfArray ( int [] ahmet) {
	 int sum=0;
	 for ( int i=0;i<ahmet.length;i++) {
		 sum+=ahmet[i];
	 }
	 return sum;
	}
	
	
	public int totalArray ( int [] hira) {
		int total=0;
		for ( int i=0;i<hira.length;i++) {
			total+=hira[i];
			
		}
		return total;
	}
	
	public static String reverse (String s ) {
		String rvrs="";
		for ( int i=s.length()-1;i>=0;i--) {
			rvrs+=s.charAt(i);
		}
		return rvrs;
	}
	
	public static String vowels (String str) {
		String getVowels;
		getVowels=str.replaceAll("[^AEOUIaeoui]","");
		return getVowels;
	}
	
		public static void main(String[] args) {
		
		Recap1 arr = new Recap1 ();
		int [] ahmet = {2,4,6};
		System.out.println("Total of the ahmet arrays is :"+ arr.sumOfArray(ahmet));
		Recap1 arr2 = new Recap1 ();
		int [] hira = { 3,6,9};
		System.out.println("Total of the hira arrays is :"+ arr2.totalArray(hira));
		
		String s=Recap1.reverse("cok yoruldum");
		System.out.println(s);
		System.out.println(reverse ("cok yoruldum"));
		
		String getVowels = vowels("Serra yaramaz mi ?");
		System.out.println(getVowels);
	}
	}


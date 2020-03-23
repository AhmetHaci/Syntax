package com.syntax.class11;

public class TaskArray2 {
	public static void main(String[] args) {
		String[] countries= {"North Ameican countries"," South American countries",
				"Europe countries","Asian countries","African countries"};
		
		for (int i=0;i<countries.length;i++) {
			System.out.print(countries[i]+" ");
		}
		System.out.println();
		System.out.println("2nd way");
		String[] countries2= new String[5];
		countries2 [0]="North Ameican countries";
		countries2 [1]=" South American countries";
				countries2 [2]="Europe countries";
				countries2 [3]="Asian countries";
				countries2 [4]="African countries";
System.out.print(countries2 [0]+" "+countries2 [1]+" "+countries2 [2]+" "+countries2 [3]+" "
		+countries2 [4]);

System.out.println();
System.out.println("=====================================================");

 String ulke[][] = { {"America","Mexica","Brazil"},
		             {"Turkey","Germany","Russia"},
		             {"Fas","Tunus","Sudan"},
		             {"Mongolia","China","Korea"}};
 int total=0;
 for (int i=0;i<ulke.length;i++) {
	 for (int j=0;j<ulke[i].length;j++)
		 System.out.print(ulke[i][j]+" ");
	 total++;
 }
 System.out.println();
 System.out.println("Total countries= "+ total);
 
for ( String[] kita:ulke) {
	for (String ulkeAdi:kita) {
		System.out.print(ulkeAdi+" ");
}
	System.out.println();
}
	}

}

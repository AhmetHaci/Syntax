package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		// let s create 2d array in which we store professions
		String [][] professions = {
				{"QA Tester", "Developer","PO","Scrum Master"},
				{"MATH TEACHER","SCIENCE TEACHER","ESL TEACHER"}
				,{"DENTIST","SURGEON"}};

	//Get elements using advance for loop
		for (String[]occupation:professions) {
			for (String title:occupation)
			System.out.print(title+" ");
							}
		System.out.println();
	}

	}



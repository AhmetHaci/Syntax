package com.syntax.class19;

public class TeacherTest extends MathTeacher{

public static void main(String[] args) {
		
	MathTeacher math1 = new MathTeacher(); 
		math1.name="Yunus";
		math1.subject="Geometry";
		math1.school="Atlanta Science Academy";
		math1.tutor();
		math1.teacherInfo();
		System.out.println();
		ChemistryTeacher chem = new ChemistryTeacher ();
		chem.name="Kemal Yavuz";

		
		

	}
}


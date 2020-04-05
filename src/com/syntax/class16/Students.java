package com.syntax.class16;

public class Students {
	
  String studentName;
  int StudentID;
 static int numberOfStudents;

    public static void main(String[] args) {
Students s1=new Students ();
	  s1.studentName="Ali Tarlaci";
	  s1.StudentID= 313;
	  s1.numberOfStudents++;	  
Students s2=new Students();
	  s2.studentName="Servet Akguc";
	  s2.StudentID=505;
	  s2.numberOfStudents++;
Students s3=new Students();
	  s3.studentName="mrSerhan";
	  s3.StudentID=532;
	  s3.numberOfStudents++;
Students s4=new Students();
	  s4.studentName="Kemal Yavuz";
	  s4.StudentID=536;
	  s4.numberOfStudents++;
	  	  System.out.println("Student 1 is "+s1.studentName+" and his ID number is "+
	  s1.StudentID);
	  System.out.println("Student 2 is "+s2.studentName+" and his ID number is "+
			  s2.StudentID);
	  System.out.println("Student 3 is "+s3.studentName+" and his ID number is "+
			  s3.StudentID);
	  System.out.println("Student 4 is "+s4.studentName+" and his ID number is "+
			  s4.StudentID);
	System.out.println("Total number of the students = " +Students.numberOfStudents );
  }

}

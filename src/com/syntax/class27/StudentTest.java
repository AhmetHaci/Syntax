package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

	String name;
	int StudentId;

	public Student(String name, int StudentId) {
		this.name = name;
		this.StudentId = StudentId;

	}

	public void display() {
		System.out.println("My name is " + name + " and my student id is " + StudentId);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// create an arraylist that will store student type of objects
		List<Student> student = new ArrayList<>();
		Student s1 = new Student("Ali", 205);
		Student s2 = new Student("Veli", 305);
		Student s3 = new Student("Yunus", 405);

		student.add(s1);
		student.add(s2);
		student.add(s3);

		for (Student students : student) {
			students.display();

		}
		System.out.println();
		//adding more students
		student.add(new Student ("Farid", 209));
		student.add(new Student ("Mike", 309));
		student.add(new Student ("Saif", 409));
		
		Iterator<Student>newS=student.iterator();
		while (newS.hasNext()) {
			newS.next().display();
		}


	}

}

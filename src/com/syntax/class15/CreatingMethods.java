package com.syntax.class15;

public class CreatingMethods {

	char getGrade(int a) {
		char grade;
		if(a>90) {
			grade='A';
		}else if (a<=90 && a>80) {
			grade='B';
		}else if (a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}return grade;
	}
}
package com.syntax.class26;

abstract class Marks {
	public abstract double gertPercentage();
}

class StudentA extends Marks {
	double math;
	double biology;
	double geography;

	StudentA(double math, double biology, double geography) {
		this.math = math;
		this.biology = biology;
		this.geography = geography;
	}

	@Override
	public double gertPercentage() {
		return (math + biology + geography) / 3;

	}

}

class StudentB extends Marks {
	double math;
	double biology;
	double geography;

	StudentB(double math, double biology, double geography) {

		this.math = math;
		this.biology = biology;
		this.geography = geography;
	}

	@Override
	public double gertPercentage() {
		return (math + biology + geography) / 3;

	}

}

public class StudentTest {

	public static void main(String[] args) {
		Marks s1 = new StudentA(98.8, 78.3, 45.6);
		System.out.println(s1.gertPercentage());

		Marks s2 = new StudentB(98.8, 88.3, 99.6);
		System.out.println(s2.gertPercentage());

	}

}

package com.replit.syntax;

public class EncapsulationDemoTest {

	public static void main(String[] args) {
		EncapsulationDemo info = new EncapsulationDemo();
		info.setEmpName("Mario");
		String EmpName = info.getEmpName();
		System.out.println("Employee Age: " + EmpName);

		info.setEmpAge(32);
		int EmpAge = info.getEmpAge();
		System.out.println("Employee Age:" + EmpAge);

	}
}
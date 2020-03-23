package com.syntax.class07;

public class DoWhileandWhile {

	public static void main(String[] args) {

		int num = -9; //even cond is not true do will print at least once because it checks the statement, while checks cond and prints
		//if only cond is true.
		do {
			System.out.println("Good morning friends"+num);
			num++;
		} while (num < 10);
	
	}

}

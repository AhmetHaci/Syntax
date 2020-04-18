package com.replit.syntax;

class Main implements Functions {
	  
	  @Override
		public void display(double result) {
			System.out.println("Result is ::: " + result);
		}

		@Override
		public double adding(double firstNumber, double secondNumber) {
			return firstNumber + secondNumber;
		}

		@Override
		public double subtracting(double firstNumber, double secondNumber) {
			return firstNumber - secondNumber;
		}

		@Override
		public double multiply(double firstNumber, double secondNumber) {
			return firstNumber * secondNumber;
		}

		@Override
		public double dividing(double firstNumber, double secondNumber) {
			return firstNumber / secondNumber;
		}
		
		public static void main (String [] args) {
			double firstNumber = 100; 
			double secondNumber = 20;
			double result; 
			
			Main run = new Main(); 
			result = run.adding(firstNumber, secondNumber);
			run.display(result);
			
			result = run.subtracting(firstNumber, secondNumber);
			run.display(result);
			result = run.multiply(firstNumber, secondNumber);
			run.display(result);
			result = run.dividing(firstNumber, secondNumber);
			run.display(result);
		}

	}
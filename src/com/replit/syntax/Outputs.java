package com.replit.syntax;

public interface Outputs {

public  abstract void display   (double result);

}
interface Functions extends Outputs {
	  double adding (double firstNumber, double secondNumber); 
	  double subtracting (double firstNumber, double secondNumber); 
	  double multiply (double firstNumber, double secondNumber); 
	  double dividing (double firstNumber, double secondNumber); 
	}
package com.skillstorm;

public class Calculater {

	public static void main(String[] args) {

		double x = 5;
		double y = 7;
		
		System.out.print(x + " + " + y + " = ");
		System.out.println(addition(x,y));
		
		System.out.print(x + " + " + y + " = ");
		System.out.println(subtraction(x,y));
		
		System.out.print(x + " + " + y + " = ");
		System.out.println(multiplication(x,y));
		
		System.out.print(x + " + " + y + " = ");
		System.out.println(division(x,y));
		
	}
	
	public static double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}
	
	public static double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}
	
	public static double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	public static double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0) return 0;
		double result = firstNumber / secondNumber;
		return result;
	}

}

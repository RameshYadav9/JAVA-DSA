package com.ss.ui;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int  firstNumber, secondNumber, result;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		firstNumber = scan.nextInt();
		System.out.println("Enter second number");
		secondNumber = scan.nextInt();
		
		result = firstNumber + secondNumber;
		System.out.println("sum =" + result);
		
		result = firstNumber - secondNumber;
		System.out.println("difference =" + result);
		
		result = firstNumber * secondNumber;
		System.out.println("product =" + result);
		
		result = firstNumber / secondNumber;
		System.out.println("quoteint =" + result);
		
		result = firstNumber % secondNumber;
		System.out.println("remainder =" + result);
		
	}

}

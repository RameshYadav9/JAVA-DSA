package com.ss.ui;

import java.io.IOException;
import java.util.Scanner;

public class ArithmeticOperationBySwitch {

	public static void main(String[] args) throws IOException {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstNumber = Scan.nextInt();
		System.out.println("Enter Second Number");
		int secondNumber = Scan.nextInt();
		System.out.println("Enter Operator");
		char op = (char) System.in.read();
		int result;
		switch(op) {
		case'+': result = firstNumber + secondNumber;
		System.out.println( result +" addition");
		break;
		case'-': result = firstNumber - secondNumber;
		System.out.println( result +" substraction");
		break;
		case'*': result = firstNumber * secondNumber;
		System.out.println( result +" multiplictaion");
		break;
		case'%': result = firstNumber % secondNumber;
		System.out.println( result +" remainder");
		break;
		case'/': result = firstNumber / secondNumber;
		System.out.println( result +" quoteint");
		
		
		}
		

	}

}

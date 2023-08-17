package com.ss.ui;

import java.util.Scanner;

public class FactorialByFunction {
	static int factorial (int n) {
		int fact = 1;
		for(int i=2; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = Scan.nextInt();
		
		int f = factorial(num);
		System.out.println("factorial is ="+ f);
			
		

	}

}

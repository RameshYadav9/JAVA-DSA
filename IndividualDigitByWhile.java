package com.ss.ui;

import java.util.Scanner;

public class IndividualDigitByWhile {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int unitDigit;
		while(num>0) {
			unitDigit = num%10;
			System.out.println(unitDigit);
			num = num /10;
		}

	}

}

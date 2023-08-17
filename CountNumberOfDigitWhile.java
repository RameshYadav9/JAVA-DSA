package com.ss.ui;

import java.util.Scanner;

public class CountNumberOfDigitWhile {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter digit");
		int num = Scan.nextInt();
		int unitDigit , count=0;
		while(num>0) {
			
			num = num/10;
			count++;		
	
		}
		System.out.println("Total Number of Digit=" + count);

	}

}

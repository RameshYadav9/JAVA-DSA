package com.ss.ui;

import java.util.Scanner;

public class PrintOddNumber {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int i;
		for(i=1; i<=num; i++) {
			
		}if(num%2!=0) {
			System.out.println(num + " is odd");
			
		}
		else {
			System.out.println(num + " is even");
	}	
}
}
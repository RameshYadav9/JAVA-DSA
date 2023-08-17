package com.ss.ui;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		boolean hasFactor = false;
		int n = 0;
		for(int i=2; i<=n; i++) {
			if(num%i==0) {
				hasFactor=true;
				break;
			}
		}
		if(hasFactor == false) {
			System.out.println(num + "is a prime number");
			
		}else {
			System.out.println(num + "is a composite number");
		}
	}
}	
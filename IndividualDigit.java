package com.ss.ui;

import java.util.Scanner;

public class IndividualDigit {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		System.out.println("Enter Number");
		int num= Scan.nextInt();
		int sum = 1;
		int i = 1;
		while(i >= num) {
			sum = sum + i;
			i++;
		
		}
		System.out.println("sum is ="+sum);
	}

}

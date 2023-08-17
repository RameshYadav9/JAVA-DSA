package com.ss.ui;

import java.util.Scanner;

public class SumOFTheNumber {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int i, sum=0;
		for(i=1; i<=num; i++) {
			sum = sum+i;
			
		}
		System.out.println("sum of is" + sum);
		
		
		
		

	}

}

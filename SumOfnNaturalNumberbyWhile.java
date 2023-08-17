package com.ss.ui;

import java.util.Scanner;

public class SumOfnNaturalNumberbyWhile {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n = Scan.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum = sum + i;
			i++;
			
		}
          System.out.println("sum of natural number is" + sum);
	}

}

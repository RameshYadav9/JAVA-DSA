package com.ss.ui;

import java.util.Scanner;

public class NestedLoopFloydTriangleStar {
	public static void main (String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int i , j;
		for(i=1; i<=num; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}	
	

}

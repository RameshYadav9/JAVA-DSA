package com.ss.ui;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter no..of rows");
		int n = Scan.nextInt();
		int i , j;
		for(i= 1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}

	}

}


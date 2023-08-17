package com.ss.ui;

import java.util.Scanner;

public class EnhancedArray {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter no..of cells");
		int size = Scan.nextInt();
		
		int[] arr = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Enter Value");
			arr[i] = Scan.nextInt();

	}
		for(int ra : arr) {
			System.out.println(ra);
		}

	}
}
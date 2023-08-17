package com.ss.ui;

import java.util.Scanner;

public class ArrayPrintInRevrseOrder {

	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner Scan = new Scanner(System.in);

		for(int i=0; i<5; i++) {
			System.out.println("Enter Number");
			arr[i] = Scan.nextInt();
		}
		
		for(int i=4; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}

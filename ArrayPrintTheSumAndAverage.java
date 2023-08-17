package com.ss.ui;

import java.util.Scanner;

public class ArrayPrintTheSumAndAverage {

	public static void main(String[] args) {
		int arr[]= new int[5];
		Scanner Scan = new Scanner(System.in);
		int sum=0;
		double average = 0;
		
		for(int i=0; i<5; i++) {
			System.out.println("enter number");
			arr[i] = Scan.nextInt();
			
		}
		for(int i=0; i<5; i++) {
			sum = sum+arr[i];
			average = sum/arr[i];
			
		}
		System.out.println(sum);
		System.out.println(average);

	}

}

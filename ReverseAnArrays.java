package com.ss.ui;

import java.util.Scanner;

public class ReverseAnArrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter Element in Array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Scan.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}

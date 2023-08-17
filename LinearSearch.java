package com.ss.ui;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter no..of cells");
		int size = Scan.nextInt();
		
		int[] arr = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Enter Value");
			arr[i] = Scan.nextInt();
			
		}
		System.out.println("Enter Value to search");
		int searchvalue = Scan.nextInt();
		
		boolean isFound = false;
		for(int i=0; i<size; i++) {
			if(searchvalue==arr[i]) {
				System.out.println(searchvalue+"is found");
				isFound = true;
				break;
				
			}
		}
		if(!isFound) {
			System.out.println(searchvalue+"is not found");
			
		}

	}

}

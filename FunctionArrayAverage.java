package com.ss.ui;

public class FunctionArrayAverage {
	static double average(int []arr) {
		int sum =0;
		double average = 0.0;
		for(int i=0; i<6; i++) {
			sum = sum+arr[i];
			
		}
		return sum/6.0;
		
		
		
		
	}

	public static void main(String[] args) {
		int[] arr = {12,13,14,15,12,34,};
		System.out.println("Average ="+ average(arr));

	}

}

package com.ss.ui;

public class ArrayQuestion1 {

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,8};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Number is:" + arr[j]);
				}
				
			}
		}

	}

}

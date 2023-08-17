package com.ss.ui;

public class FunctionTest {
	static void print(int ... arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		print(10,12,12,23);
		print(10,12,12,23);
		print(10,12,12,23);
		

	}

}

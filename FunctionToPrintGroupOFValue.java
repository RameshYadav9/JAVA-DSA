package com.ss.ui;

public class FunctionToPrintGroupOFValue {
	static void print(int[]arr) {
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		print(new int[]{12,20,30});
		print(new int[]{12,50});
		
		int[] a = {12,20,30,60,70,100};
		print(a);
	}
	

}

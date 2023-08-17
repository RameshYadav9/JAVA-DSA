package com.ss.ui;

public class FebnocciSeries {

	public static void main(String[] args) {
		int previous=0,next=1,result=0;
		for(int i=0;i<=8;i++) {
			System.out.print(previous + " ");
			result = previous+next;
			previous = next;
			next = result;
		}

	}

}

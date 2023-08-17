package com.ss.ui;

import java.util.Scanner;

public class reverseNumber2 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num  = Scan.nextInt();
		int unitDigit , reverse=0;
		while(num>0) {
			unitDigit = num%10;
			reverse = (reverse*10)+unitDigit;
			num=num/10;
			
		}
		System.out.println("Reverse Number " + reverse);
		
	}

}

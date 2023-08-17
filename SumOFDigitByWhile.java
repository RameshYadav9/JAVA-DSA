package com.ss.ui;

import java.util.Scanner;

public class SumOFDigitByWhile {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Digits");
		int num = Scan.nextInt();
		int  unitDigit , sum = 0;
		while(num>0) {
			unitDigit = num%10;
			sum=sum+unitDigit;
			num=num/10;
			
			
			
		}
		System.out.println(sum);

	} 

}

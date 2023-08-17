package com.ss.ui;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int  unitDigit, sum=0;
		int c;
		c = num;
		while(num>0) {
			unitDigit = num%10;
			sum = sum*10+unitDigit;
			num = num/10;
		
		}
		if(sum==c) 
			System.out.println("palindrome number");
					
		else
		System.out.println("not palindrome number");
	}
}	
package com.ss.ui;

import java.util.Scanner;

public class armstring22 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = Scan.nextInt();
		int val , unitDigit , arm=0;
		val = num;
		while(num>0) {
			unitDigit=num%10;
			arm=(unitDigit*unitDigit*unitDigit)+arm;
			num=num/10;
		}
		if(val==arm)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
		

	}

}

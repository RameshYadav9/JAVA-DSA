package com.ss.ui;

import java.util.Scanner;

public class ChekPrimeNumber {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int factor = 0;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				factor ++;
				
			}
		}
        if(factor==0) {
        	System.out.println(num + "is a prime number");
        	
        }else {
        	System.out.println(num + "is a composite number");
        }
	}

}

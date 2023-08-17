package com.ss.ui;

import java.util.Scanner;

public class AddOnlyEvenDigits {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter digits");
		int num = Scan.nextInt();
		
	    int i, unitDigit, sum=0;
	    while(num>0) {
	    	unitDigit = num%10;
	    	if(unitDigit%2==0) {
	    		sum = sum+unitDigit;
	    	}
	    	num = num/10;
	    }
	    System.out.println("sum of even digits is" + sum);

	}

}

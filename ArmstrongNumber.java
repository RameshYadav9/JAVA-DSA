package com.ss.ui;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = Scan.nextInt();
		int val , unitDigit , arm = 0;
		val = num;
       while(num>0) {
    	   unitDigit = num%10;
    	   arm = (unitDigit*unitDigit*unitDigit)+arm;
    	   num = num/10;
    	   
       }
        if(val == arm) 
        	System.out.println("Armstrong number");
        else
        	System.out.println("not Armstrong number");
        
	}    	  
}
	

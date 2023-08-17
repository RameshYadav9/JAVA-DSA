package com.ss.ui;

import java.util.Scanner;

public class FactorialByForLoop {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter value");
		  int number = Scan.nextInt();
		  int i,fact=1;  
		      
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}	   
}		  
	 



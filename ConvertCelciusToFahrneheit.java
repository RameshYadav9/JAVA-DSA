package com.ss.ui;

import java.util.Scanner;

public class ConvertCelciusToFahrneheit {

	public static void main(String[] args) {
		int celcius;
		double fahrenheit;
		Scanner Scan =  new Scanner(System.in);
		System.out.println("Enter temperature in celcius");
		celcius = Scan.nextInt();
		
		fahrenheit = (celcius * 1.8 + 32 ); 
		System.out.println(fahrenheit + " fahrenheit");
	}

}

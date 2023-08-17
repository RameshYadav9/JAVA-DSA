package com.ss.ui;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int  principal , rate ,time;
		double simpleInterest;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("principal");
	    principal = scan.nextInt();
	    System.out.println("rate");
	    rate = scan.nextInt();
	    System.out.println("time");
	    time = scan.nextInt();
	    
	    simpleInterest = principal*rate*time/100.0;
	    System.out.println("simpleInterest=" + simpleInterest);
	}

}

package com.ss.ui;

import java.util.Scanner;

public class FunctionOverloadingConcept {
	static double area(int length , int breadth) {
       double result = length*breadth;
		return result;
	}
	static double area(int area) {
		double result = 3.14*area*area;
		 return result; 
		
	}
	

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		int length = Scan.nextInt();
		int breadth = Scan.nextInt();
		System.out.println("Enter radius of circle ");
		int area = Scan.nextInt();
		System.out.println("area of ractangle ="+ area(length,breadth));
		System.out.println("area of circle ="+ area(area));
		
		
	}
    

}

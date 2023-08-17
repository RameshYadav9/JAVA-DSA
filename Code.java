package com.ss.ui;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a = Scan.nextInt();
		int b = Scan.nextInt();
		int c = (a>b) ? a : b;
		System.out.println(c + "is bigger");
		

	}

}

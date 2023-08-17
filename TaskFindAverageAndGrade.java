package com.ss.ui;

import java.util.Scanner;

public class TaskFindAverageAndGrade {

	public static void main(String[] args) {
		int mathe , physics , chemistry , average;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Mark In Mathe");
		mathe = Scan.nextInt();
		System.out.println("Mark In Physics");
		physics = Scan.nextInt();
		System.out.println("Mark In Chemistry");
		chemistry = Scan.nextInt();
		int sum = mathe + physics + chemistry;
		double average1 = sum/3.0;
		System.out.println(average1 + " Average");
		if(average1>=60 && mathe>=35 && physics>=35 && chemistry>=35) {
		System.out.println("First Class");
		
		}else if(average1>=50 && mathe>=35 && physics>=35 && chemistry>=35) {
		System.out.println("Second Class");	
		
		}else if(average1>=35 && mathe>=35 && physics>=35 && chemistry>=35) {
		System.out.println("Third Class");
		
		}else {
		System.out.println("You Are Failed");	
		}
		
		
			

	}

}

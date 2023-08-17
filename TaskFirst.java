package com.ss.ui;

import java.util.Scanner;

public class TaskFirst {

	public static void main(String[] args) {
		int month , year;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month");
		month = scan.nextInt();
		System.out.println("Enter Year");
		year = scan.nextInt();
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
		System.out.println("Last day In This Is 31 ");
		}
		else if(month==4 || month==6 || month==9 || month==11) {
		System.out.println("Last Day In This Month Is 30");
		}
		else if((year%4==0 || year%400==0 && year%100 != 0 ) && month<13){
		System.out.println("Last Day In This Month is 29");
	
		}
		else if (month==2 && (year%4!=0 || year% 400!=0 && year%100==0)){
		System.out.println("Last Day In This Month Is 28");
		
		}
		else {
		System.out.println("invalid");	
		}
		}
	
		
		

	}



package com.ss.ui;

import java.io.IOException;
import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) throws IOException {
		char character;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter charactor");
		char ch = (char) System.in.read();
		
		if(ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z') {
		switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println(ch + "is vovel");
			          break ;
			          
			 default: System.out.println(ch + "is consonent");
			         break;
		}
	}else {
			System.out.println(ch + " is not a alphabate");
		}
	
		
		}
		
		
	}



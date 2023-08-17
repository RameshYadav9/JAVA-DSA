package com.ss.ui;

import java.util.Scanner;

public class ArrayMatrixTranspose {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter Size Of First Matrix");
		int m = Scan.nextInt();
		int n = Scan.nextInt();
		int[][] arr = new int[m][n];
		int i , j;
        System.out.println("enter value in first matrix");
        for(i=0; i<m;i++) {
        	for(j=0;j<n;j++) {
        		arr[i][j]= Scan.nextInt();

	}
        	

        }
        int[][] trr = new int[n][m];
        for(i=0; i<n;i++) {
        	for(j=0;j<m;j++) {
        		trr[i][j]= arr[j][i];
	}
}
        System.out.println("result");
        for(i=0; i<n; i++) {
        	for(j=0;j<m;j++) {
        		System.out.println(trr[i][j]+ "\t");
        	}
        	System.out.println();
        }
}
}
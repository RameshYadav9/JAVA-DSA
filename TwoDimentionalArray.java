package com.ss.ui;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter size of first matrix");
        int m = Scan.nextInt();
        int n = Scan.nextInt();
        System.out.println("enter size of second matrix");
        int p = Scan.nextInt();
        int q = Scan.nextInt();
        
        if(m != p || n != q) {
        	System.out.println("matrix can not be add");
        	System.exit(0);
        	
        }
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[p][q];
        int[][] arr3 = new int[m][n];
        
        int i , j;
        System.out.println("enter value in first matrix");
        for(i=0; i<m;i++) {
        	for(j=0;j<n;j++) {
        		arr1[i][j]= Scan.nextInt();
        		
        	}
        }
        System.out.println("enter value in second matrix");
        for(i=0; i<p;i++) {
        	for(j=0;j<q;j++) {
        		arr2[i][j]= Scan.nextInt();
        
	}

}
        
        for(i=0; i<m;i++) {
        	for(j=0;j<n;j++) {
        		arr3[i][j]= arr1[i][j] + arr2[i][j];
        	}
        }
        System.out.println("result matrix..");
        for(i=0; i<m; i++) {
        	for(j=0; j<n; j++) {
        		System.out.println(arr3[i][j]+"\t");
        	}
        	System.out.println();
        }
	}
}

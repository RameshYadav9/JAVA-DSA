package com.ss.ui;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = {10,23,23,45,45};
		int searchValue = 10;
		int index = Arrays.binarySearch(arr,searchValue);
	    if(index>=0){
		System.out.println("found");
		
			
		

	}else {
		System.out.println("not found");
	}

	}}

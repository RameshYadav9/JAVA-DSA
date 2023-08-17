package com.ss.ui;
public class BiggerNumberPrinter {
    public static void main(String[] args) {
        int num1 = 79;
        int num2 = 78;
        
        int biggerNumber = (num1 > num2) ? num1 : num2;
        
        System.out.println("The bigger number is: " + biggerNumber);
    }
}
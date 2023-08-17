package com.ss.ui;

public class FunctionPrintArgs {

	public static void main(String ... args ) {
		System.out.println("Arguments ar..");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}

}

package com.example.package1;

public class exceptionsample1 {

	public static void main(String[] args) {
		int n=10;
		int m=0;
		
		try {
			int ans = n/m;
			System.out.println("append result is :"+ans);
		}
		catch(ArithmeticException e) {
			System.err.println("error occured divide by 0"+e);
		}

	}

}

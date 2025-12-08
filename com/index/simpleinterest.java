package com.index;

import java.util.Scanner;

public class simpleinterest {
	
	public static final double rate = 8.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter principal, time");
		double prinicpal = sc.nextDouble();
		double time  = sc.nextDouble();
		double si = (prinicpal*rate*time)/100;
		
		System.out.println("Simple interest is:"+si);

	}

}

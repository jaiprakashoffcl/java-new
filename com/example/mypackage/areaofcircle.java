package com.example.mypackage;

import java.util.Scanner;

public class areaofcircle {
	
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double area = PI*radius*radius;
		System.out.println(area);
	}

}

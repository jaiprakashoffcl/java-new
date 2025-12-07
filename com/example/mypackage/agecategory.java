package com.example.mypackage;

import java.util.Scanner;

public class agecategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<=12) {
			System.out.println("Child");
		} else if(age<=19) {
			System.out.println("Teenager");
		} else if(age<=50) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}

	}

}

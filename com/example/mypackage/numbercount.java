package com.example.mypackage;

import java.util.Scanner;

public class numbercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count =0;
		int temp = num;
		
		while (temp%2 == 0) {
			temp /= 2;
			count++;
		}
		System.out.println(num + " is divisible by 2 by " + count + " times");
	}

}

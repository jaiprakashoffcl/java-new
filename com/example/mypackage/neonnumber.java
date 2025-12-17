package com.example.mypackage;

import java.util.Scanner;

public class neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum =0;
		int square = num*num;
		
		while(square>0) {
			int rem = square%10;
			sum = sum+rem;
			square = square/10;	
		}
		if(num == sum) {
			System.out.println("yes this is neon number");
		} else {
			System.out.println("not a neon");
		}

	}

}

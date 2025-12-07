package com.index;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		while (num >0) {
			int digit = num%10;
			sum += digit;
			num /= 10;	
		}
		System.out.println("sum of digit:"+sum);
	}

}

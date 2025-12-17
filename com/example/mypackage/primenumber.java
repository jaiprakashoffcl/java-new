package com.example.mypackage;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			boolean isprime = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j ==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.print(i+" ");
			}
		}

	}

}

package com.index;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=0;
		
		while(num>0) {
			num = num/10;
			temp++;
		}
		System.out.println(temp);
	}

}

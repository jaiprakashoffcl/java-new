package com.index;

import java.util.Scanner;

public class positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println("The number positive");
		} else {
			System.out.println("the number is negative");
		}
		sc.close();
	}

}

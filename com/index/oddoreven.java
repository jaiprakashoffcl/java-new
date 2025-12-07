package com.index;

import java.util.Scanner;

public class oddoreven {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("entered num is even");
		}
		else {
			System.out.println("entered num is odd");
		}
		sc.close();
	}

}

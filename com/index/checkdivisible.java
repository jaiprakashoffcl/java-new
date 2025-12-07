package com.index;

import java.util.Scanner;

public class checkdivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number%7 == 0) {
			System.out.println("Number : "+number+" Disible by 7");
		}
		else {
			System.out.println("not divisible by 7");
		}
	}

}

package com.index;

import java.util.Scanner;

public class userchecking {

	public static final int max = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int current = sc.nextInt();
		if(current > max) {
			System.out.println("user limit excedded.....");
		}
		else {
			System.out.println("users are okay within maximum limit....");
		}

	}

}

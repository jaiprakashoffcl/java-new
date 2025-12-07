package com.index;

import java.util.Scanner;

public class largestoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		if(a1 > a2) {
			System.out.println(a1+" is the largest");
		} else {
			System.out.println(a2+" is the largest");
		}
	}

}

package com.example.mypackage;

import java.util.Scanner;

public class arrayequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[4];
		int[] arr2 = new int[4];
		
		for(int i =0;i<arr1.length;i++) {
			arr1[i] =sc.nextInt();
		}
		for(int i =0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		boolean equal = true;
		
		if(arr1.length != arr2.length) {
			equal = false;
		}
		else {
			for(int i =0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					equal = false;
					break;
				}
			}
		}
		
		if(equal) {
			System.out.println("array are equals");
		}
		else {
			System.out.println("not equal");
		}
	}

}

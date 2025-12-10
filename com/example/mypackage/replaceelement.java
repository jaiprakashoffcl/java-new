package com.example.mypackage;

import java.util.Scanner;

public class replaceelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter old element to replace: ");
		int oldvalue = sc.nextInt();
		
		System.out.println("Enter new element :");
		int newvalue = sc.nextInt();
		
		for(int i =0;i<arr.length;i++) {
			if(oldvalue == arr[i]) {
				arr[i] = newvalue;
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}

}

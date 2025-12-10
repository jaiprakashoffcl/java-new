package com.example.mypackage;

import java.util.Scanner;

public class removedulication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];  //10,20,30,40,50,60
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		
		for(int i =0;i<arr.length;i++) {
			for(int j =1;j<arr.length;j++) {
				if(arr[i] != arr[j]) {
					System.out.println("no duplicates found");
					found = true;
				}
				else {
					found = false;
				}
			}
		}

	}

}

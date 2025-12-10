package com.example.mypackage;

import java.util.Scanner;

public class searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,50,60,40,12};
		
		int element = sc.nextInt();
		boolean found = false;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == element) {
				System.out.println("element found at index: "+i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("not found");
		}
	}
}

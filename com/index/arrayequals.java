package com.index;

import java.util.Scanner;

public class arrayequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i =0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(arrayequals(arr1,arr2));
	}
		
		public static boolean arrayequals(int[] arr1,int[] arr2 ){
			if(arr1.length != arr2.length) {
				return false;
			}
			for(int i =0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}

}

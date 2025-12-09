package com.example.mypackage;

import java.util.Scanner;

public class swaparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40};

		int i = 1;
		int j = 3;

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		for(int x =0;i<arr.length;i++) {
			System.out.println(arr[x]);
		}

	}

}

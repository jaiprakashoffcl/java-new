package com.index;

import java.util.Scanner;

public class minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
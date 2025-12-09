package com.index;

import java.util.Scanner;

public class reversearray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = arr.length -1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

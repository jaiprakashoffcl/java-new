package com.index;

import java.util.Scanner;

public class oddandevenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count1 =0;
		int count2 =0;
		int arr[] = new int[6];
		
		System.out.println("Enter the array numbers: ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		
		System.out.println("even count in arr is: "+count1+" odd count is:"+count2);
	}

}

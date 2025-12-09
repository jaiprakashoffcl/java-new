package com.example.mypackage;

import java.util.Scanner;

public class elementevenindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			if(i%2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}

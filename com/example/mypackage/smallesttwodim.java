package com.example.mypackage;

import java.util.Scanner;

public class smallesttwodim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter rows:");
		int rows = sc.nextInt();
		
		System.out.println("enter cols");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		
		
		for(int i =0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int smallest = arr[0][0];
		for(int i =0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				if(arr[i][j] < smallest) {
					smallest = arr[i][j];
				}
			}
		}
		System.out.println("smallest element is "+smallest);
		
	}

}

package com.example.mypackage;

import java.util.Scanner;

public class twodimmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row:");
		int rows = sc.nextInt();
		System.out.println("enter column:");
		int cols = sc.nextInt();
		
		
		int[][] arr = new int[rows][cols];

		for(int i =0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

package com.example.mypackage;

import java.util.*;

public class rowsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows:");
        int rows = sc.nextInt();
        
        System.out.println("Enter column:");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter the value: ");
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<rows;i++) {
        	int sum =0;
        	for(int j =0;j<cols;j++) {
        		sum += arr[i][j];
        	}
        	System.out.print(sum+" ");
        }
	}

}

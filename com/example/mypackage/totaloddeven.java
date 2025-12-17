//Count the total number of even and odd numbers in a 2D array.

package com.example.mypackage;

import java.util.Scanner;

public class totaloddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter row size:");
		int rows = sc.nextInt();
		System.out.println("enter column size:");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j =0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int count1 =0;
		int count2=0;
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]%2 ==0) {
					count1++;
				}
				else {
					count2++;
				}
			}
		}
		System.out.println("total odd count in 2D is : "+ count2+" and even count: "+count1);
	}

}

package com.index;

import java.util.Scanner;

public class evenoddadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		//int a1 = sc.nextInt();
		//int a2 = sc.nextInt();
		//int a3 = sc.nextInt();
		//int a4 = sc.nextInt();
		int[] arr1 = new int[4];
		
		int count1 =0;
		int count2 =0;
		for(int i =0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i] % 2 == 0) {
				count1 += arr1[i];
			}
			else {
				count2 += arr1[i];
			}
		}
		System.out.println("total odd values :"+count1+" total even values:"+count2);
	}

}

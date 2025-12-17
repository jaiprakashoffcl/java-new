package com.index;

import java.util.Scanner;

public class specificelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to add array:");
		int element = sc.nextInt();
		
		int[] newarr = new int[arr.length+1];
		
		for(int i =0;i<arr.length;i++) {
			newarr[i] = arr[i];
		}
		newarr[newarr.length-1] = element;
		
		for(int i =0;i<newarr.length;i++) {
			System.out.print(newarr[i]+ " ");
		}
	}

}

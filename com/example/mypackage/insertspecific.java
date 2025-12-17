package com.example.mypackage;

import java.util.Scanner;

public class insertspecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] newarr = new int[arr.length+1];
		System.out.println("enter the element to add");
		int element = sc.nextInt();
		
		System.out.println("enter the specific index(0 - n) to add");
		int pos = sc.nextInt();
		
		for(int i =0;i<pos;i++) {
			newarr[i] = arr[i];
		}
		newarr[pos] = element;
		
		for(int i =pos;i<arr.length;i++) {
			newarr[i+1] = arr[i];
		}
		
		for(int i  =0;i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}
		
	}

}

package com.example.mypackage;

public class reversepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int s=num;s>i;s--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

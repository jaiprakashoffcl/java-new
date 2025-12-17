package com.example.mypackage;

public class numberchanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 1;
		for(int i =1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(nums+" ");
				nums++;
			}
			System.out.println();
		}
	}

}

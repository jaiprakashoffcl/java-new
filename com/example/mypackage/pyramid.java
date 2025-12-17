package com.example.mypackage;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=4;i++) {
			for(int s=4;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

package com.example.mypackage;

public class arrayexceptionexample1 {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		try {
			int x = arr[3];
			System.out.println("result:"+x);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("error occured"+e);
		}

	}

}

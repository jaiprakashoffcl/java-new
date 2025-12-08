package com.index;

public class secondlargest {
	
	public static int secondlargest(int[] arr) {
		int large =arr[0];
		int second =arr[0];
		
		for(int i =1 ;i<arr.length;i++) {
			if(arr[i] > large) {
				second = large;
                large = arr[i];
			} else if(arr[i] > second && arr[i] != large) {
				second = arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,50,40,60};
		System.out.println(secondlargest(arr));
	}

}

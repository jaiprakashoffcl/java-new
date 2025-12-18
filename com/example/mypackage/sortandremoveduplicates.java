package com.example.mypackage;

public class sortandremoveduplicates {

	public static void main(String[] args) {
		//1.sort
		int[] arr = {30,40,60,80,10,30,40};
		
		int temp=0;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i] > arr[j]) {
				temp=arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		//2.remove duplicate
		int[] newarr = new int[arr.length];
		int k=0;
		
		for(int i =0;i<arr.length;i++) {
			boolean removed = false;
			for(int j=0;j<k;j++){
				if(arr[i] == newarr[j]) {
					removed = true;
					break;
				}
			}
			if(!removed) {
				newarr[k] = arr[i];
				k++;
			}
		}
		
		for(int i =0;i<k;i++) {
			System.out.println(""+newarr[i]);
		}
	}

}

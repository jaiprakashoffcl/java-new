package com.example.package1;

import java.util.ArrayList;

public class removeevennumber {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(10);
		arr1.add(31);
		arr1.add(12);
		arr1.add(5);
		arr1.add(7);
		
		System.out.println(arr1);
		
		ArrayList<Integer> s1 = new ArrayList<>();
		for(int s2:arr1) {
			if(s2%2 != 0) {
				s1.add(s2);
			}
		}
		System.out.println("removed even numbers "+s1);
	}

}

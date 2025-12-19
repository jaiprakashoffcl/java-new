package com.example.package1;

import java.util.ArrayList;

public class searchelementarray {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(4);
		arr1.add(12);
		arr1.add(43);
		arr1.add(20);
		
		int searchelement = 12;
		boolean found = false;
		
		for(int s1:arr1) {
			if(s1 == searchelement) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("element found");
		}
		else {
			System.out.println("not found");
		}

	}

}

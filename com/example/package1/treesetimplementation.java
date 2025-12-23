package com.example.package1;

import java.util.*;

public class treesetimplementation {

	public static void main(String[] args) {
		
		//creating tree set (stores unique element in sorted order)
		Set<Integer> s1= new TreeSet<>();
		
		s1.add(50);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50); // duplicate will ignored
		
		System.out.println(s1);
		
		//check existence
		System.out.println("contains 30? "+s1.contains(30));
		System.out.println("contains 60? "+s1.contains(60));
		
		// remove element
		s1.remove(30);
		System.out.println("updated "+s1);
		
		//size
		System.out.println("size "+s1.size());
		
//		iteration (sorted order)
		System.out.println("\niterating TreeSet");
		for(int num : s1) {
			System.out.println(num);
		}
		
		//clearing treeset
		s1.clear();
		System.out.println("trees after clear() "+s1);
	}

}

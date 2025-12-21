package com.example.package1;

import java.util.HashSet;

public class setimplementation {

	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<>(); 
		
		//add elements
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(10);  //it does not allow duplicate elements
		
		System.out.println("set elements "+s1);
		
		//remove
		s1.remove(30);
		
		//checking presence
		System.out.println("contains 20? :"+s1.contains(20));
		
		//size
		System.out.println("size :"+s1.size());

		
	}

}

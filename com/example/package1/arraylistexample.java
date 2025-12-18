package com.example.package1;

import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<>();
		
		//add elements
		s1.add("java");
		s1.add("python");
		s1.add("c#");
		System.out.println(" "+s1);
		
		//add index
		s1.add(1, "javascript");
		System.out.println("added new  "+s1);
		
		//access element
		System.out.println(s1.get(2));
		
		//update element
		s1.set(0, "core java");
		System.out.println("updated "+s1);
		
		//delete element
		s1.remove("c#");
		System.out.println("removed "+s1);
		
		//size
		System.out.println(s1.size());
		
		//iterate
		for(String s : s1) {
			System.out.println(s);
		}
	}
}

package com.example.package1;

import java.util.*;

public class hashsetprgm {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Mango");
		hashSet.add("Apple"); //duplicate ignores
		
		System.out.println("HashSet (no specific order): "+hashSet);
		
		//operations
		hashSet.remove("Apple");
		System.out.println("After removing apple "+hashSet);
		
		System.out.println("contains mango? "+hashSet.contains("Mango"));
		System.out.println("size: "+hashSet.size());
		
		//iteration
		System.out.println("Iterating HashSet:");
		for(String fruits: hashSet) {
			System.out.println(fruits);
		}


	}

}

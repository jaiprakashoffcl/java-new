package com.example.package1;

import java.util.*;

public class hashmapprogram {

	public static void main(String[] args) {
		Set<String> linkedset = new LinkedHashSet<>();
		
		linkedset.add("Red");
		linkedset.add("Blue");
		linkedset.add("Green");
		linkedset.add("Red"); //duplicates ignored
		
		System.out.println("linked hash set (insertion order): "+linkedset);
		
		//operations
		linkedset.remove(1);
		System.out.println("After removing: "+linkedset);
		
		System.out.println("contains green? "+linkedset.contains("Green"));
		System.out.println("size: "+linkedset.size());
		
		//iteration
		System.out.println("Iterating LinkedHashSet:");
		for(String item : linkedset) {
			System.out.println(item);
		}
	}

}

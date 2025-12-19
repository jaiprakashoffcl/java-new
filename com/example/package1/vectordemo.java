package com.example.package1;

import java.util.*;

public class vectordemo {

	public static void main(String[] args) {
		// create a vector
		Vector<Integer> vec = new Vector<>();
		
		//add element
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		//insert element at specific index
		vec.add(1, 15);
		
		//accessing elements
		System.out.println("element at index 2: "+vec.get(2));
		
		//update values
		vec.set(0, 5);
		
		//remove elements
		vec.remove(2);
		
		//displaying vector
		System.out.println("vector: "+vec);
		
		//vector size and capacity
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
		
		//iterating using for each
		for(int x:vec) {
			System.out.println("value "+x);
		}
	}

}

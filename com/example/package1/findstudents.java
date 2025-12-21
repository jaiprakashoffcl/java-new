package com.example.package1;

import java.util.*;

public class findstudents {

	public static void main(String[] args) {
		int[] studentid =  {101,102,103,104,101,105,102};
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		for(int id : studentid) {
			if(!s1.add(id)) { //set duplicate elements allow panathu 
				s2.add(id);
			}
		}
		System.out.println("duplicate elements are "+s2);

	}

}
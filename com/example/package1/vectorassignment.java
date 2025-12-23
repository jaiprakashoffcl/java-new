package com.example.package1;

import java.util.*;

public class vectorassignment {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> even = new Vector<>();
		Vector<Integer> odd = new Vector<>();
		
		v1.add(10);
		v1.add(20);
		v1.add(21);
		v1.add(19);
		v1.add(15);
		v1.add(27);
		
		System.out.println("List is :"+v1);
		
		for(int num : v1) {
			if(num%2==0) {
				even.add(num);
			}
			else {
				odd.add(num);
			}
		}
		System.out.println("Even numbers in the list :"+even);
		System.out.println("Odd numbers in the list :"+odd);

	}

}

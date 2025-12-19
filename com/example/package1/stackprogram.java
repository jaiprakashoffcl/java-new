package com.example.package1;

import java.util.*;

public class stackprogram {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();
		
		//push elements
		s1.push("A");
		s1.push("B");
		s1.push("C");
		s1.push("D");
		s1.push("E");
		
		System.out.println("Stack "+s1);
		
		//peek(last element)
		System.out.println("peek "+s1.peek());
		
		//pop(removes last inserted element)
		System.out.println("Popped "+s1.pop());
		
		//Search element (1-based index)
		System.out.println("Position of B: "+s1.search("B"));
		
		//check empty
		System.out.println("is stack empty? "+s1.empty());

	}

}

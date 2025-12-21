package com.example.package1;

import java.util.*;

public class deque_implementation {

	public static void main(String[] args) {
		
		//deque implementations 
		Deque<String> dq = new ArrayDeque<>();
		
		// add an element
		dq.add("Deque operations");
		dq.addFirst("I am adding first");
		System.out.println("After add and addfirst :"+dq);
		dq.addLast("last");
		System.out.println("After addLast :"+dq);
		
		// remove an element
		dq.removeFirst();
		System.out.println("Remove first "+dq);
		dq.removeLast();
		System.out.println("Remove last "+dq);
		
		dq.peekFirst();
		System.out.println(dq);
		
		dq.offerFirst("Hai hello");
		dq.offerLast("welcome");
		System.out.println(dq);
		
		
	}

}

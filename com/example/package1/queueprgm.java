package com.example.package1;

import java.util.*;

public class queueprgm {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		
		// add
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		
		System.out.println("Queue list :"+q1);
		System.out.println("Queue remove : "+q1.remove());
		System.out.println("Queue poll : "+q1.poll());
		System.out.println("Queue peek :"+q1.peek());
		System.out.println("Queue list :"+q1);
		
		System.out.println("Queue offer :"+q1.offer(10));
		System.out.println("Queue element :"+q1.element());
		System.out.println(q1);
		

	}

}

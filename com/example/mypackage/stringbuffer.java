package com.example.mypackage;

public class stringbuffer {

	public static void main(String[] args) {

		//string buffer
		StringBuffer sb = new StringBuffer("hello ");
		
		//1.append
		sb.append("Welcome to String buffer");
		System.out.println("append result is :"+sb);
		
		//2.insert
		sb.insert(12,"the world");
		System.out.println("insert result :"+sb);
		
		//3.replace
		sb.replace(0,6,"Hello all");
		System.out.println("replace result :"+sb);
		
		//4.delete
		sb.delete(0, 6);
		System.out.println("deleted result :"+sb);
		
		//5.reverse
		sb.reverse();
		System.out.println("reverse result :"+sb);
		
		//6.length & capacity
		System.out.println("length result :"+sb.length());
		System.out.println("capacity result :"+sb.capacity());
		
	}

}
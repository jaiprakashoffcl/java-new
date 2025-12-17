package com.example.mypackage;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello ");
		
		//1.append
		sb.append("This is string buffer");
		System.out.println("append result is :"+sb);
		
		//2.insert
		sb.insert(5, "Welcome");
		System.out.println("insert result is :"+sb);
		
		//3.replace
		sb.replace(0, 5, "example");
		System.out.println("replace result is :"+sb);
		 

	}

}

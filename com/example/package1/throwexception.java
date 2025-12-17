package com.example.package1;

public class throwexception {
	static void checkage(int age1) {
		if(age1<18) {
			throw new IllegalArgumentException("Access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		checkage(19);
	}

}

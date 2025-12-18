package com.example.package1;

public class nestedtry {

	public static void main(String[] args) {

		try {
			String s = null;
			try {
				System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("inner catch: string is null");
		}}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("outer catch: invalid array index");
		}
		finally {
			System.out.println("the code is executed");
		}
	}

}

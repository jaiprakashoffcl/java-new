package com.example.package1;

public class replacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("this is string buffer");
		String s1 = "java program ";
		sb.replace(0, 8, s1);
		System.out.println("result: "+sb);
	}

}

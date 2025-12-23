package com.example.java;

public class spilitcoverage {

	public static void main(String[] args) {
		
		String text = "j@ava";
		
		String[] parts = text.split("@");
		String result = parts[0]+parts[1];
		System.out.println(result);
		
		String text1 = "H@i How@ A@re Y@ou";
		
		String[] part1 = text1.split("@");
		for(int i=0;i<part1.length;i++) {
			String result1 = part1[i];
			System.out.print(""+result1);
		}
	}

}

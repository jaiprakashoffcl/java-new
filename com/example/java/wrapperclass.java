package com.example.java;

public class wrapperclass {

	public static void main(String[] args) {
		int x =25;
		
		Integer y = new Integer(x);
		System.out.println(y);
		
		int x1 =25;
		
		Integer y1 = Integer.valueOf(x1);
		System.out.println(y1);
		
		char a = 'A';
		Character y2 = new Character(a);
		System.out.println(y2);
		
		int a1 = 20;
		Integer obj = a1; // Autoboxing : int-> Integer
		
		System.out.println("Auto boxing "+obj);
		
		// multiple delimeters
		String s1 = "apple;orange,bannana";

		String[] part1 = s1.split("[,;]");
		for(int i=0;i<part1.length;i++) {
			String result1 = part1[i];
			System.out.println(""+result1);
		}
		
		String s2 = ",java,,python,,c++,,";
		String[] part2 = s2.split(",");
		for(int i=0;i<part2.length;i++) {
			String result2 = part2[i];
			System.out.print(" "+result2);
		}
	}

}

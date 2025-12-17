package com.example.mypackage;

public class Stringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "Hello";
		String second = "world";

		
		//length
		int length = first.length();
		System.out.println("Length: "+length);
		
		//join string concatt or (+)
		String joinedstring = first.concat(second);
		String joinedstringplus = first+""+second;
		System.out.println("Joined string:"+joinedstring);
		System.out.println("Joined string:"+joinedstringplus);
		
		//compare two strings equals or (==)
		boolean result = first.equals(second);
		System.out.println(result);
		
		//using new operator 
		String sec1 = new String("Hai");
		System.out.println("Through object :"+sec1);
		
		//replace
		String s1 = "bat ball";
		System.out.println("replaced b with c :"+s1.replace('b','c'));
		//replace all 
		String s2 = "ipl 2026";
		System.out.println("replaced b with c :"+s2.replaceAll("basket ball", "carrom"));
		
		//uppercase
		System.out.println(" "+s2.toUpperCase());
		
		//lowercase
		System.out.println(" "+s2.toLowerCase());
		
		//character at position
		System.out.println("character at pos: "+s2.charAt(2));
		
		//substring
		System.out.println("sub string:"+" "+s2.substring(0,5));
	}

}

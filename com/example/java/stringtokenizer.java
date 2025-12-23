package com.example.java;

import java.util.*;

public class stringtokenizer {

	public static void main(String[] args) {
		
		//type 1: default delimeter(space)
		
		System.out.println("type 1 default space delimeter");
		StringTokenizer st1 = new StringTokenizer("Java Python C++");
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		//2.custome delimeter 
		System.out.println("type 2 custom delimeter(comma)");
		StringTokenizer st2 = new StringTokenizer("A,B,C",",");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		//3. custom delimeter + returndelims = true
		System.out.println("type 2 custom delimeter + returndelims = true");
		StringTokenizer st3 = new StringTokenizer("A,B:C", ",:", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}

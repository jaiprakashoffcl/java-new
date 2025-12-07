package com.index;

public class addtwonum {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public float add(float a,float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addtwonum t2 = new addtwonum();
		
		System.out.println(t2.add(10,20));
		System.out.println(t2.add(6, 12, 10));
		System.out.println(t2.add(5f, 2.5f));
	}

}

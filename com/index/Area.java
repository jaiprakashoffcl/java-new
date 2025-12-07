package com.index;

public class Area {
	
	public int area(int side) {
		return side*side;
	}
	public int area(int length, int breadth) {
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area ar = new Area();
		System.out.println("Area of square:"+ar.area(12));
		System.out.println("Area of rectangle:"+ar.area(6, 12));
	}

}

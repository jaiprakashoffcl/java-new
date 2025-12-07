package com.index;

class Shape{
	String color;
}

class circle extends Shape{
	double radius;
	void cir(){
		double area = 3.14 * radius * radius;
		System.out.println("area of circle : "+area);
	}
}

class rectangle extends Shape{
	double length;
	double width;
	void rect() {
		double areax = length * width;
		System.out.println("area of rectangle :"+areax);
	}
}

public class shapes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1 = new circle();
		rectangle r1 = new rectangle();
		c1.radius = 5;
		r1.length = 6;
		r1.width = 12;
		
		c1.cir();
		r1.rect();
	}

}

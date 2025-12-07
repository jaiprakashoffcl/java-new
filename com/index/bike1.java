package com.index;

class bike{
	String brand;
	int price;
	
	void display() {
		System.out.println("brand of bike is "+brand+" price is "+price);
	}
}

public class bike1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b1 =new bike();
		b1.brand= "NS200";
		b1.price = 118000;
		
		bike b2 = new bike();
		b2.brand = "Yamaha  RX100";
		b2.price = 250000;
		b1.display();
		b2.display();
	}

}

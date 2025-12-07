package com.index;

abstract class animals{
	abstract void sounds(); //abstract method
	void sleep() {   // non abstract method
		System.out.println("Sleep");
	}
}

public class abstractclass extends animals{
	void sounds() {
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractclass abs = new abstractclass();
		abs.sleep();
		abs.sounds();
	}

}

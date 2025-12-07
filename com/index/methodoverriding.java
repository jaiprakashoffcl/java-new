package com.index;

class animal5{
	void sound() {
		System.out.println("Animal sounds well");
	}
}

class dog5 extends animal5{
	@Override
	void sound() {
		System.out.println("Dog barks...");
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal5 ani = new dog5();
		ani.sound();
	}

}

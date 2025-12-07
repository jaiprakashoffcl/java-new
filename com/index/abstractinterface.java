package com.index;

interface b1{
	void barks();
	void sleep();
}

class animals3 implements b1{
	public void barks() {
		System.out.println("Dog barks....");
	}
	public void sleep() {
		System.out.println("Dogs sleeps....");
	}
}

public class abstractinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 obj = new animals3();
		obj.barks();
		obj.sleep();

	}

}

package com.example.mypackage;

class examples1{
	private examples1() {}
	private static examples1 ex = new examples1();
	public static examples1 getInstance() {
		return ex;
	}
	public void display() {
		System.out.println("singleton is working");
	}
}

public class singlepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		examples1 ex = examples1.getInstance();
		ex.display();
		

	}

}

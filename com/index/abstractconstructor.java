package com.index;

abstract class animal4{
	animal4(){ //default constructor
		System.out.println("Default constructor...");
	}
	abstract void sounds(); //abstract method
	void sleep() {   // non abstract method
		System.out.println("Sleep");
	}
}

public class abstractconstructor extends animal4{
	
	abstractconstructor(){
		System.out.println("abstract constructor....");
	}
	
	void sounds() {
		System.out.println("dog barks....");
	}
	public static void main(String []args) {
		animal4 obj = new abstractconstructor();
		obj.sleep();
		obj.sounds();
	}
}

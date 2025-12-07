package com.index;

interface Animalx{
	void bark();
}
interface cat{
	void meow();
}

class dogs1 implements Animalx,cat{
	public void bark() {
		System.out.println("Dog Barks...");
	}
	public void meow() {
		System.out.println("Cat Meows....");
	}
}

public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs1 dog1= new dogs1();
		dog1.bark();
		dog1.meow();
	}

}

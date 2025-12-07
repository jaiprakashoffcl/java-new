package com.index;

class Animal{
	void eat() {
		System.out.println("The animal eats food");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks...");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.eat();
		myDog.bark();
	}

}

package com.index;

class Animal1{
	void eat() {
		System.out.println("The animal eats food");
	}
}

class Mammal extends Animal1{
	void walk() {
		System.out.println("Mammal.....");
	}
}

class Dog1 extends Mammal{
	void bark() {
		System.out.println("Dog Barks...");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 myDog = new Dog1();
		myDog.eat();
		myDog.bark();
		myDog.walk();

	}
}

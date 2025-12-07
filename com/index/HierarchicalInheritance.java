package com.index;

class Animal3{
	void eat() {
		System.out.println("Animal eats food");
	}
}

class dog3 extends Animal3{
	void bark() {
		System.out.println("Dog barks....");
	}
}
class cat3 extends Animal3{
	void meow(){
		System.out.println("Cat meows");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog3 d3 = new dog3();
		d3.eat();
		d3.bark();
		
		cat3 c3 = new cat3();
		c3.eat();
		c3.meow();

	}

}

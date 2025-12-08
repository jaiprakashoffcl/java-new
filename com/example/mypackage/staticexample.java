package com.example.mypackage;

class staticexample1{
	static int counter =0;
	staticexample1(){
		counter++;
	}
}

public class staticexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticexample1 obj1 = new staticexample1();
		staticexample1 obj2 = new staticexample1();
		staticexample1 obj3 = new staticexample1();
		System.out.println(staticexample1.counter);
	}

}

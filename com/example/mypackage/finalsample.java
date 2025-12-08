package com.example.mypackage;

class sample1{
	final int a =100;
	void show() {
		//a = 101; 
		//not possible if we give final keyword.
		System.out.println("max"+a);
	}
}

public class finalsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 s1 = new sample1();
		s1.show();
		
	}

}

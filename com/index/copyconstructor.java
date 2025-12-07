package com.index;

class student{
	int id;
	String name;
	student(int id,String name){
		this.id = id;
		this.name = name;
	}
	student(student s){
		this.id = s.id;
		this.name = s.name;
	}
	void display() {
		System.out.println("ID is : "+id+"Name : "+name);
	}
}

public class copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(101,"jp");
		student s2 = new student(s1);
		s1.display();
		s2.display();
	}

}

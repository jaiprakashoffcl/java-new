package com.index;
//multilevel inheritance
class Person{
	String name;
	int age;
}

class employee extends Person{
	int empid;
	int salary;
}

class manager extends employee{
	String dept;
	void displayDetails() {
			System.out.println(name);
			System.out.println(age);
			System.out.println(empid);
			System.out.println(salary);
			System.out.println(dept);
			
	}
}

public class company1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m1 = new manager();
		m1.name="jai prakash";
		m1.age = 22;
		m1.empid = 123;
		m1.salary = 50000;
		m1.dept = "software";
		
		m1.displayDetails();
	}

}

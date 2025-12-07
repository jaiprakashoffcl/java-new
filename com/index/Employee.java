package com.index;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	public Employee(int id){
		this.id = id;
		System.out.println("ID:"+id);
	}
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
	
	public Employee(int id, String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary ="+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Employee(101);
		new Employee(102,"jai prakash");
		new Employee(103,"nikil",25000);
	}

}

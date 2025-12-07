package com.index;

import java.util.Scanner;

public class employee1 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		int employeeid = sc.nextInt();
		String employeename = sc.next();
		int empSalary = sc.nextInt();
		String empdesignation = sc.next();
		String empcity  = sc.next();
		
		System.out.println("Employee ID :"+employeeid);
		System.out.println("Employee Name :"+employeename);
		System.out.println("Employee Salary :"+empSalary);
		System.out.println("Employee Designation :"+empdesignation);
		System.out.println("Employee City :"+empcity);
		
		sc.close();
	}
}

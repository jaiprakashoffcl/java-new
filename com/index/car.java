package com.index;

public class car {
	
	String name;
	double mileage;
	String fueltype;
	
	public car(String name) {
		this.name=name;
		System.out.println("car name:"+name);
	}
	public car(String name,double mileage) {
		this.name = name;
		this.mileage = mileage;
		System.out.println("car name"+name);
		System.out.println("mileage gives"+mileage);
	}
	public car(String name,double mileage,String fueltype) {
		this.name = name;
		this.mileage = mileage;
		this.fueltype = fueltype;
		System.out.println("car name"+name);
		System.out.println("mileage gives"+mileage);
		System.out.println("fuel type"+fueltype);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new car("bmw");
		new car("benz",18.9);
		new car("mclaren", 19.1,"petrol");
	}

}

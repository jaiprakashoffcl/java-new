package com.index;

public class bonuscalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int experience = 6;
		double salary = 60000;
		
		double bonus;
		if(experience>5) {
			bonus = salary * 0.20;
		}
		else {
			bonus = salary *0.10;
		}
		System.out.println("bonus:"+bonus);
	}

}	
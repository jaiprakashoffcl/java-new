package com.index;

import java.util.*;

public class studentgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double average = sc.nextDouble();
		int roundavg = (int)average;
		
		char grade;
		if(roundavg >= 90) {
			grade ='A';
		}
		else if (roundavg >= 75 && roundavg <= 89) {
			grade = 'B';
		}
		else if (roundavg >= 50 && roundavg <= 74) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("Round Average:" +roundavg);
		System.out.println("Grade:" +grade);
		
		sc.close();
	}
}

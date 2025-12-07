//Temp > 30 → Hot

//15–30 → Warm

//<15 → Cold

package com.index;

import java.util.Scanner;

public class temperaturecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temp degree in celsius");
		int temp = sc.nextInt();
		
		if(temp>30) {
			System.out.println("temperature is hot");
		}
		else if(temp>15 && temp <= 30) {
			System.out.println("temperature is warm");
		}
		else {
			System.out.println("temperature is cold");
		}
	}

}

package com.index;

import java.util.*;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float data = sc.nextFloat();
		
		int temp = (int)data;
		
		System.out.println("original temperature: "+data);
		System.out.println("converted temperature:"+temp);
		
		
		sc.close();
	}

}

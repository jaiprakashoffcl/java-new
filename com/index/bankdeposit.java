package com.index;

import java.util.*;

public class bankdeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long balance = sc.nextLong();
		float rate = sc.nextFloat();
		
		double finalbalance = balance + (balance * rate / 100);
		
		System.out.println("Balance:"+balance);
		System.out.println("Interest rate:"+rate);
		System.out.println("Final balance:"+finalbalance);
		
		sc.close();
	}
}

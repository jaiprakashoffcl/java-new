package com.index;

import java.util.*;

public class onlineshopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		int discount = sc.nextInt();
		
		double finalprice = price -(price*discount/100);	
		
		System.out.println("Original Price: " + price);
        System.out.println("Discount: " +discount+"%");
        System.out.println("Final Price: " + finalprice);
        
        sc.close();
	}

}

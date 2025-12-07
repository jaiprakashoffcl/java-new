package com.example.mypackage;

import java.util.Scanner;

public class password {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		
		boolean checknum = false;
		int s = password.length();
		
		if(s>6) {
			for (int i = 0; i<s; i++) {
	            if (Character.isDigit(password.charAt(i))) {
	                checknum = true;
	                break;
	                }
	            }
			}
			if(checknum) {
				System.out.println("valid password");
			} else {
				System.out.println("not valid");
			}
}
}

package com.index;

public class votingcheck {

	public static void voteeligible(int age) {
		if(age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voteeligible(12);
		voteeligible(26);
	}

}
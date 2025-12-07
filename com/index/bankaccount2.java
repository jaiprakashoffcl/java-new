package com.index;

public class bankaccount2 {
	
	private int accno;
	private int balance;
	
	public int getaccno() {
		return accno;
	}
	public int getbalance() {
		return balance;
	}
	public void displayaccno(int accno){	
		this.accno = accno;
	}
	public void displaybal(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankaccount2 b2 = new bankaccount2();
		b2.displayaccno(1012);
		b2.displaybal(25000);
		
		System.out.println("account number "+b2.getaccno());
		System.out.println("balance:"+b2.getbalance());
	}

}

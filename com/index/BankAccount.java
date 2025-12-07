package com.index;

public class BankAccount {
	int accno;
	String holdername;
	int balance;
	
	BankAccount(int accno){
		this.accno = accno;
		System.out.println("Account number:"+accno);
	}
	BankAccount(int accno,String holdername){
		this.accno = accno;
		this.holdername = holdername;
		System.out.println("Account number:"+accno);
		System.out.println("holder name:"+holdername);
	}
	BankAccount(int accno,String holdername,int balance){
		this.accno = accno;
		this.holdername = holdername;
		this.balance = balance;
		System.out.println("Account number:"+accno);
		System.out.println("holder name:"+holdername);
		System.out.println("balance:"+accno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BankAccount(101);
		new BankAccount(102,"jai prakash");
		new BankAccount(103, "vijay",25000);
	}

}

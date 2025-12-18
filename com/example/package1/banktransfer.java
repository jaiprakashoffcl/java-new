package com.example.package1;

class InvalidTransactionException extends Exception{
	InvalidTransactionException(String msg){
		super(msg);
	}
}

public class banktransfer {

	public static void main(String[] args) {
		double amount = 12000;
		try {
		if(amount>10000) {
			throw new InvalidTransactionException("Daily limit exceeded");
		}
		else {
			System.out.println("you were not reached daily limit");
		}
		}
		catch(InvalidTransactionException ex){
			System.out.println(ex.getMessage());
		}
	}
}

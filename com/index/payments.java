package com.index;

interface Payment{
	void pay(double amount);
}

class CreditCardPayment implements Payment{
	public void pay(double amount) {
		System.out.println(amount + " using credit card paid successfull....");
	}
}
class UPIPayment implements Payment{
	public void pay(double amount) {
		System.out.println(amount +" using upi payment paid successfull.....");
	}
}

public class payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment c1 = new CreditCardPayment();
		c1.pay(65000);
		
		UPIPayment u1 = new UPIPayment();
		u1.pay(65000);

	}

}

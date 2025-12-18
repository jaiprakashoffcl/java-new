package com.example.package1;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}


public class SalaryException {

	public static void main(String[] args) {
		double salary = 12000;
		try {
        if (salary < 15000) {
            throw new InvalidSalaryException("Salary below minimum wage");
		} else {
			System.out.println("salary was perfect");
		}
		}
		catch(InvalidSalaryException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

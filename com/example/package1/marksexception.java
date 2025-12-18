package com.example.package1;

class InvalidMarksException extends Exception{
	InvalidMarksException(String msg){
		super(msg);
	}
}

public class marksexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks =120;
		try {
			if(marks< 0 || marks>100) {
				throw new InvalidMarksException("Marks between 0 to 100");
			}
			else {
				System.out.println("Valid marks: "+marks);
			}
		}
		catch(InvalidMarksException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

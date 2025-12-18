package com.example.package1;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int[] arr = new int[5];
		arr[10] =50;
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bounds exception");
		}
		catch(Exception ex) {
			System.out.println("Generic exception");

		}
	}

}

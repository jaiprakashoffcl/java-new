package com.index;

public class objectcount {
	
	private static int count = 0;
	
	public objectcount() {
		count++;
	}
	public static int getobject() {
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objectcount obj1 = new objectcount();
		objectcount obj2 = new objectcount();
		objectcount obj3 = new objectcount();
		System.out.println("total count is :"+objectcount.getobject());
		
	}

}

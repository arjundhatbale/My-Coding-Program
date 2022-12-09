package com.ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		try {
			throw new MyException("Vishal");
		}
		catch(MyException es) {
			System.out.println("Exception catch in cathch bloc");
			System.out.println(es.getMessage());
		}
	}
}

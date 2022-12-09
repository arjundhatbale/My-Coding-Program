package com.ExceptionHandling;

public class P1 {

	public static void main(String[] args) {
		System.out.println("first std");
		System.out.println("first std");
		System.out.println("first std");
		 
		System.out.println("first std");
		try {
			int noe = 23/0;
		}catch(ArithmeticException e) {
			System.out.println("Output of termination condition is >> ");
		}
		 
		finally {
			System.out.println("Finaly last line statement is printed");
		}
	}
}

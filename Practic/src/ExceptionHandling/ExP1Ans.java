package com.ExceptionHandling;

public class ExP1Ans {

	public static void main(String[] args) {
		try {
			throw new ExP1();
		}
		catch(Exception es) {
			System.out.println("Caught ");
			System.out.println(es.getMessage());
		}
	}
}

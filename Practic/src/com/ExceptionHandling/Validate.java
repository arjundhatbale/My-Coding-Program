package com.ExceptionHandling;

public class Validate {

	public static void Validate(int age) {
		if(age < 19) {
			throw new ArithmeticException("Person not Eligible for vote:");
		}else {
			System.out.println("This person can do vote >> : ");
		}
	}
	public static void main(String[] args) {
		Validate  (2);
		 
	}
}

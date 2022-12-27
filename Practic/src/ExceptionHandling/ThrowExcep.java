package com.ExceptionHandling;

public class ThrowExcep {

	public static void fun() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
			System.out.println("I find the null pointer exception in catch bllock");
			throw e;
		}
	}
	public static void main(String[] args) {
		try
		{
			fun();
		}
		catch(NullPointerException e) {
			System.out.println("Caught in main method");
		}
	}
}

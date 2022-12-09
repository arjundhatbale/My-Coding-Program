package com.ExceptionHandling;

public class P9 {

	static void fun() throws IllegalAccessException{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException ("demo");
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch(IllegalAccessException d) {
			System.out.println("Caught in main");
		}
	}
}

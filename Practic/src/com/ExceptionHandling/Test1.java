package com.ExceptionHandling;

public class Test1 {

	public static void main(String[] args) {
		try {
			throw new Test("invalid input");
		}catch(Exception e) {
			e.getMessage();
		}
	}
}

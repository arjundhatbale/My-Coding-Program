package com.Functions;

// java Program to Pass Method as Argument

public class MethodCallInArgument {

	// calculate the sum
	public int add(int n1 , int n2) {
		
		int sum = n1 + n2;
		return sum;
	}
	// calculate the square
	public void square(int num) {
		int result = num * num;
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		MethodCallInArgument  obj = new MethodCallInArgument();
		
		// call the square() method
		// passing add() as an argument
		obj.square(obj.add(23,4));
	}
}

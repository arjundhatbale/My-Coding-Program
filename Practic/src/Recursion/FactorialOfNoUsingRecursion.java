package com.Recursion;

// find the factorial of number using recursion

public class FactorialOfNoUsingRecursion {
	
	
	static int factorial(int n) {
		 
		if(n != 0) 							 // Termination condtion
			return n* factorial(n-1);		 // recursive call 
		else
			return 1;
		
	}
	public static void main(String[] args) {
		
		int  number = 4 , result; 
		result = factorial(number);
		System.out.println(number + " factorial = " + result );
	
	}
}

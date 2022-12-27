package com.ExceptionHandling;

// JAVA Program to Demonstrate Exception is Thrown
// How the runtime System Searches Call-Handler


public class P5 {

	// Method 1
	// It throws the Exception(ArithmeticException)-
	// Appropriate Exception handler is not found 
	// within ths method.
	static int divideByZero(int a, int b) {
		// this statement will cause ArithmeticException 
		
		int i = a/ b;
		return i;
	}
	// The run time system searches the appropriate Exception handler in method
	// also but couldn't have found so looking forward on the call stack
	static int computDivision(int a , int b ) {
		int res = 0;
		try {
			res = divideByZero( a,  b);
		}
		// catch block to handle numberFormatException
		// exception doesn't matches with arithmeticexception
		catch(NumberFormatException ex) {
			System.out.println("Number Format exception");
		}
		return res;
	}
	public static void main(String[] args) {
		
		int a = 2;
		int b  =0 ;
		try {
			int i = computDivision(a,b);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

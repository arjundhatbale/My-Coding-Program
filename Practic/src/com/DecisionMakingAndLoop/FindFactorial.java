package com.DecisionMakingAndLoop;

// Find the Factorial of Number

public class FindFactorial {

	public static void main(String[] args) {
		
		int number = 5;
		
		long factorial = 1;
		
		for(int i=1; i <= number; ++i) {
			
			// factorial = factorial * i;
			factorial *= i;
		}
		System.out.printf("Factorial of %d =  %d ", number ,factorial);
		FindFactorial obj = new FindFactorial();
		obj.m();
	}
	void m() {
		int num = 5;
		int i = 1;
		long  factorial = 1;
		while(i<=num) {
			factorial *= i;
			i++;
		}
		System.out.printf("Factoral of %d = %d",num,factorial);
	}
}

package com.DecisionMakingAndLoop;

// Calculate the power of no by using while loop

public class CalPowerOfNoByWhile {

	public static void main(String[] args) {
		
		System.out.println("Calculate the power of no : ");
		int no = 5 ; 
		int power = 3;
		
		System.out.println("Power of no is : " + Math.pow(no, power));
		CalPowerOfNoByWhile obj = new CalPowerOfNoByWhile();
		obj.m();
	}
	void m() {
		System.out.println("Calculate the power by using while loop");
		int no = 5;
		int exponent = 3;
		int base = 1; 
		
		while(exponent != 0) {
			base = base * no;
			--exponent;
		}
		System.out.println("Power of no is : " + base);
	}
}

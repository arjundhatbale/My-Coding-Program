package com.Recursion;
 
// G.D.C Using Recursion

public class GDC {
	
	public static void main(String[] args) {
		int num1  = 366;
		int num2 = 60;
		int GCD = gcd(num1,num2);
		System.out.printf("G.C.D. of %d and %d is %d.", num1, num2, GCD);
	}
	static int gcd (int num1, int num2) {
		if(num2 !=0)
			return gcd(num2,num1 % num2);
		else
			return num1;
	}
}

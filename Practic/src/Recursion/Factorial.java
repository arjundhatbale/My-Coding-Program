package com.Recursion;

// Facotrial of a number using recursion

public class Factorial {

	public static void main(String[] args) {
		
		int num = 6;
		long factorial = multiplyNumber(num);
		System.out.println(num + " Factorial is : " + factorial);
	}
	public static long multiplyNumber(int num) {
		if(num >= 1) {
			return num * multiplyNumber(num - 1);
		}else {
			return 1;
		}
	}
}

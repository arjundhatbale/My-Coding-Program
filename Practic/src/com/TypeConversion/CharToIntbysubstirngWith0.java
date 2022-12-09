package com.TypeConversion;

public class CharToIntbysubstirngWith0 {
	public static void main(String[] args) {
		
		// crrat char variable
		char a = '9';
		char b = '2';
		
		System.out.println("charactor value of a is : " + a);
		System.out.println("charactor value of b is : " + b);
		// Convert char variables to int 
		// by subtracting with char 0
		
		int num1 = a - '0';
		int num2 = b - '0';
		
		// print numeric value 
		System.out.println("Integer value of a is : " + num1);
		System.out.println("Integer value of b is : " + num2);
		int c = num1 + 43;
		System.out.println(c);
	}
}

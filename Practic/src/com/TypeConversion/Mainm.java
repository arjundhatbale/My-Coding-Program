package com.TypeConversion;

public class Mainm {
	public static void main(String[] args) {
		
		char a = 'a';
		char b = 'z';
		
		// convert char variables to int 
		// use getNumericValue() 
			
		int num1 = Character.getNumericValue(a);
		int num2 = Character.getNumericValue(b);
		
		// print the numeric value of characters
		
		System.out.println(num1);
		System.out.println(num2);
	}
}

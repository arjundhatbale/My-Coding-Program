package com.str;

import java.util.Scanner;

public class Reverse_Number {
	
	static void Method_1 () {
		System.out.println("Method - 1 : \nEnter a number >> ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse =  reverse * 10 +  remainder ;
			num = num / 10;
			 
		}
		System.out.println("Revers num = " + reverse);
	}
	public static void main(String[] args) {
		Method_1();
		
	}
}

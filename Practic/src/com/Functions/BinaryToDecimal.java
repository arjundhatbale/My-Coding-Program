package com.Functions;

// Convert Binary no into Decimal number 

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		// Take binary variable
		long binary = 101001;
		
		// Create Integer variable and call the BinaryToDecimal method
		 long Decimal =  binaryToDecimal(binary);
		System.out.println("Binary to Decimal");
		System.out.println( binary + " = " + Decimal);
	}
	public static int binaryToDecimal(long binary) {
		int DecimalNumber = 0; int i = 0;
		long Reminder ;
		
		while(binary != 0) {
			Reminder = binary % 10;
			DecimalNumber += Reminder * Math.pow(2, i);
			++i;
			binary = binary /10;
		}
		return DecimalNumber;
	}
}

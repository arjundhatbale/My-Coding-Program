package com.TypeConversion;

// Decimal to Binary Conversion using toBinaryString()

public class DecimalTobinary {

	public static void main(String[] args) {
		
		// decimal number 
		int decimal = 23;
		
		// convert decimal to binary
		String binary = Integer.toBinaryString(decimal);
		System.out.println(decimal + " in decimal = " + binary + " in binary");
		
	}
}

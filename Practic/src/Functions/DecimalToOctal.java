package com.Functions;

// Convert Decimal to Octal

public class DecimalToOctal {
	public static int decimalToOctal(int decimal) {
		int octal  = 0, i = 1, Remainder;
		
		while(decimal != 0) {
			Remainder = decimal % 8;
			octal += Remainder * i;
			decimal = decimal / 8;
			i = i*10;
		}
		return octal;
	}
	public static void main(String[] args) {
		
		// decimal number
		int decimal = 23;
		
		// call function DecimalToOcatl
		int octal = decimalToOctal(decimal);
		System.out.println(decimal + " in Decimal = " + octal + " in Ocatal.");
	}
	
}

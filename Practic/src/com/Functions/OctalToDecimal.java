package com.Functions;

// convert Octal number System to Decimal number System.

public class OctalToDecimal {

	public static void main(String[] args) {
		// Octal number
		int OctalNumber = 116;
		
		// Convert Octal into Decimal 
		int DecimalNumber = octalNumberTodecimal(OctalNumber);
		System.out.printf("%d in Octal is = %d in Decimal",OctalNumber, DecimalNumber);
	}
	public static int octalNumberTodecimal(int OctalNumber) {
		int DecimalNumber = 0, i = 0;
		 
		while(OctalNumber != 0) {
			 
		    DecimalNumber +=    (OctalNumber % 10) * Math.pow(8, i);
			++i;
			OctalNumber /=   10;
		}
		return DecimalNumber;
	}
}

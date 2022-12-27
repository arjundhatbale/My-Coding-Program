package com.Functions;

// Binary to Octal
// 1 Convert Binary to Decimal
// 2 Convert Decimal to Octal.

public class BinaryToOctal {

	public static void main(String[] args) {
		// Binary number 
		long BinaryNumber = 11111L;
		
		// Octal number 
		int OctalNumber = binaryToOctal(BinaryNumber);
		System.out.printf("%d BinaryNumeber is = %d Octal Number.",BinaryNumber, OctalNumber);
	}
	public static int binaryToOctal(long BinaryNumber) {
		int Decimal = 0, i = 0 ;
		
		while(BinaryNumber != 0) {
			Decimal += (BinaryNumber % 10) * Math.pow(2,i);
			++i;
			BinaryNumber /= 10; 
		}
		
		i =1;
		
		while(Decimal != 0) {
			BinaryNumber += (Decimal % 8) * i;
			Decimal /= 8;
			i *= 10;
		}
		return (int)BinaryNumber ;
	}
}

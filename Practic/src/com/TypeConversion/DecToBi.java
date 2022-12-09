package com.TypeConversion;
// Decimal to Binary using Custom Method
public class DecToBi {
public static void main(String[] args) {
	
	// decimal number 
	int num = 19;
	System.out.println("Decimal to Binary");
	
	// call method to convert to binary
	long binary = convertDecimalToBianary(num);
	System.out.println("\n" + num + " = " + binary);
}
public static long convertDecimalToBianary(int n) {
	long binaryNumber = 0;
	int Reminder , i = 1, step = 1;
	
	while(n != 0) {
		Reminder = n % 2;
		System.out.println("Step " + step++ + ": " + n + "/2");
		System.out.println("Quotient = " + n/2 + ", Reminder = " + Reminder);
		
		n = n / 2;
		binaryNumber += Reminder * i;
		i *= 10;
	}
	return binaryNumber;
}
}

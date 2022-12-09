package com.TypeConversion;

// Binary to Int by using parseInt()
public class BiToInt {

	public static void main(String[] args) {
		
		String binary = "101010";
		
		// convert to decial
		int decimal = Integer.parseInt(binary,8);
		System.out.println(binary + " in binary = " + decimal + " in Decimal.");
		 
	}
}

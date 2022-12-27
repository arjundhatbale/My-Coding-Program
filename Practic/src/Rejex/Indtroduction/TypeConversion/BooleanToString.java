package com.TypeConversion;

// Convert boolean to String by useing toSting ();

public class BooleanToString {
	
	public static void main(String[] args) {
		
		// boolean variable
		boolean b1 = true;
		boolean b2 = false;
		
		// convert boolean to String busing toSting method
		
		String str1 = Boolean.toString(b1);
		String str2 = Boolean.toString(b2);
		
		// print output
		
		System.out.println("String output = " + str1);
		System.out.println("String output = " + str2);
	}
}

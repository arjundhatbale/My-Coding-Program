package com.TypeConversion;

public class BooleanToStirng {
	public static void main(String[] args) {
		
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;
		
		// convert boolean to string
		// using valueOf();
		
		String stringValue1  = String.valueOf(booleanValue1);
		String stringValue2 = String.valueOf(booleanValue2);
		
		System.out.println("Boolean true  into string = " + stringValue1);
		System.out.println("Boolean false int string  = " + stringValue2);
				
	}
	void boolean_ToString_using_toSting() {
		
		// creat boolean variable
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;
		
		// convert boolean to string 
		// using toString ();
		
		String strValue1 =  Boolean.toString(booleanValue1);
		
		String strValue2 = Boolean.toString(booleanValue2);  
		
		System.out.println(strValue1);
		System.out.println(strValue2);
	}
}

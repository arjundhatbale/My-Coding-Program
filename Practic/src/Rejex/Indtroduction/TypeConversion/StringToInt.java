package com.TypeConversion;

public class StringToInt {
	public static void main(String[] args) {
		
		// take string input
		
		String s1 = "33857";
		String s2 = "12233";
		
		// convert string to int 
		// using paseInt();
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		// output
		
		System.out.println("stirng to int is : " + num1);
		System.out.println("String to int  is :" + num2);
		
		StringToInt  obj = new StringToInt ();
		obj.StrTointUsint_valueOf();
	}
	void StrTointUsint_valueOf() {
		
		// convert string to int using valueOf() method
		
		String s1 = "42";
		String s2 = "222222";
		
		// convert str into int
		
		int num1 =  Integer.valueOf(s1);
		int num2 = Integer.valueOf(s2);
		
		// print output
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}

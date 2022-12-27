package com.Indtroduction;

public class CheckStirngEnptyOrNull {
	public static void main(String[] args) {
		
		// Create null, empty, and regular strings 
		
		String str1 = null;
		String str2 = "   ";
		String str3 = "";
		
		// check if stri1 is null or elmpty
		
		System.out.println("str1 is " + isNullEmpty(str1));
		
		// check if str2 is null or empty
		System.out.println("str2 is " + isNullEmpty(str2));
		
		// check if str3 is null or empty
		
		System.out.println("str3 is " + isNullEmpty(str3));
		
	}
	public static String isNullEmpty (String str){
		
		// check if string is null
		if(str == null){
			return "NULL";
		}
		
		 // check if string is empty
		else if(str.isEmpty()) {
			return "Empty";
		}else {
			return "neither null or empty";
		}
	}
}

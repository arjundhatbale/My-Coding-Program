package com.str;

public class ReversingAnEquation {
	public static String reverseEquation(String str) {
		
		// Resultant string 
		String result = "";
		String strr = "";
		 
		
		for(int i = 0 ; i < (str.length()   ); i++) {
			
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' ) {
				
				// Insert the word at the beginning of the result string
				
				result = str.charAt(i) + strr + result;
				strr = "";
				System.out.println("if >>   " + result );
			}else {
				strr += str.charAt(i);
				System.out.println("else >>  " + result);
			}
			System.out.println(result);
		}
		result = strr + result;
		return result;
	}
	public static void main(String[] args) {
		
		String str = "a+b*c/d-e";
		System.out.println(reverseEquation(str));
	}
}

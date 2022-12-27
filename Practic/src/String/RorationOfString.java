package com.str;

public class RorationOfString {

	static boolean check_roatation(String s1, String s2) {
		 
		return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);	
		}
	
	public static void main(String[] args) {
		
		String s1 = "AACD";
		String s2 = "ACDA";
		
		// FUNCTION CALL
		if(check_roatation(s1,s2)) {
			System.out.println("Strings are roatations of each other");
		}else
			System.out.println("Strings are not rotations of each other");
	}
}

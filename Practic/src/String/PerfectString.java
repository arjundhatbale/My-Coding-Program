package com.str;

public class PerfectString {
	public static boolean check(String str) {
		
		boolean flag = false; 
		int i = 0; 
		int j= str.length()-1;
		while(i <j) {
			if(str.charAt(i) == str.charAt(j)) { 
				i++;
				j--;
				continue;
			}else {
				flag = true;
				break;
			}
		}
		return !flag;
	}
	public static void main(String[] args) {
		
		String s = "abcdcba";
		System.out.println("Is string s is Palindrom ? " + check(s));
	}
}

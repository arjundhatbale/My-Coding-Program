package com.str;

public class MinimumRotation {
	 
	public static void main(String[] args) {
		String s = "abcdefg";
		int len = s.length();
		
		String check = "";
		for(int i = 1; i < (len + 1); i++) {
			
			check = s.substring(0, i) + s.substring(i, len);
			if(check.equals(s)) {
				System.out.println(i);
				break;
			}
			break;
		}
	}
}

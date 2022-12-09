package com.JavaString;

public class ReverseByIteration {

	public static String reverseString(String name) {
		char ch[] = name.toCharArray();
		String reverse = "";
		for(int i = ch.length-1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		return reverse;
	}
}

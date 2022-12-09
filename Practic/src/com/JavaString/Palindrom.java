package com.JavaString;

public class Palindrom {

	public static boolean isPlindrom(String name) {
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		String rev = sb.toString();
		
		if(name.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}
}

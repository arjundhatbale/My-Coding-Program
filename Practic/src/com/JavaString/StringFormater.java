package com.JavaString;

public class StringFormater {

	public static String capital(String name) {
		String word[] = name.split("\\s");
		String empty = "";
		
		for(String charactor : word) {
			String first = charactor.substring(0,1);
			String afterfirst = charactor.substring(1);
			empty += first.toUpperCase()+ afterfirst + " ";
		}
		return empty.trim();
	}
}

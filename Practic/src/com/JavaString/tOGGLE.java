package com.JavaString;

public class tOGGLE {

	public static String toggle(String word) {
		String words[] = word.split("\\s");
		String toggle = "";
		
		for(String character : words) {
			String first = character.substring(0,1);
			String afterfirst = character.substring(1);
			toggle +=  first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
		return toggle;
	}
}
 

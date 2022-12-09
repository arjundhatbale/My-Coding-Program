package com.JavaString;

public class JAVAStringBuilder {

	public static void main(String[] args) {
		//StringBuilder append() method
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java ");
		System.out.println(sb);
		
		// StringBuilder insert() method
		sb.insert(11, "Programing");
		System.out.println(sb);
		
		// StringBuilder replace () method
		sb.replace(6, 10, "HTML");
		System.out.println(sb);
	}
}

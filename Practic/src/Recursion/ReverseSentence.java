package com.Recursion;

// Reverse a sentence a using Recursion

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String sentence = "Go work";
		String reversed = reverse(sentence);
		System.out.println("The reverse sentence is: " + reversed);
		 
	}
	public static String reverse(String sentence) {
		if(sentence.isEmpty()) {
			return sentence;
		}
		System.out.println(sentence);
		return reverse(sentence.substring(1))+ sentence.charAt(0);
	}
}

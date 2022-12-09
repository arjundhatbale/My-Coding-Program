package com.Indtroduction;

public class Check_Whether_Charactor_is_Alphabet {
	
	public static void main(String[] args) {
		char c = '*';
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is an alphabet.");
		}else {
			System.out.println(c + " is not an alphabet.");
		}
		Check_Whether_Charactor_is_Alphabet obj = new Check_Whether_Charactor_is_Alphabet();
		obj.byUsingTernaryOperator();
		obj.byUsingisAlphabticMethod();
	}
	void byUsingTernaryOperator() {
		char c = 'A';
		String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')? c + " is an alphabet.": c + " is not an alphabet.";
		System.out.println(output);
	}
	void byUsingisAlphabticMethod() {
		
		// declare a variable
		char c = 'a';
		
		// checks if c is an alphabet;
		if(Character.isAlphabetic(c)) {
			System.out.println(c + " is an alphabet.");
		}else {
			System.out.println(c + " is not an alphabet.");
		}
	}
}

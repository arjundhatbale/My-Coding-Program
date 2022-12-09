package com.DecisionMakingAndLoop;

// check Alphabet using if else

public class CheckCharactor {

	public static void main(String[] args) {
		
		char c = '*';
		
		if(c >= 'a' && c <= 'z') {
			System.out.println(c + " is a Alphabet.");
		}else
			System.out.println(c + " is not Alphabet.");
		CheckCharactor obj = new CheckCharactor();
		obj.check();
		obj.checkMethode();
	}
	void check() {
		
		// check charactor is alphabet using ternery operator
		char ch = '*';
		
		String output = (ch >= 'a' && ch <= 'z' ) ? ch + "is Alphabet" : ch + " is not Alphabet";
		System.out.println("output");
	}
	void checkMethode() {
		char c = 'S';
		
		// check if c is an alphabet 
		if(Character.isAlphabetic(c)) {
			System.out.println(c + " is an alphabet");
		}else {
			System.out.println(c + " is not an alphabet");
		}
	}
}

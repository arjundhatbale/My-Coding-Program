package com.Indtroduction;

public class CheckWhetheranAlphabetIsVowelorConsonant {
	public static void main(String[] args) {
		
		char ch = 'i';
		
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
			System.out.println(ch + " is a vowel.");
		else
			System.out.println(ch + " is a consonant.");
		CheckWhetheranAlphabetIsVowelorConsonant obj = new CheckWhetheranAlphabetIsVowelorConsonant();
		obj.byUsingSwitchStatement();
	}
	void byUsingSwitchStatement() {
		
		char ch = 'z';
		switch (ch) {
		case 'a' : 
		case 'e' : 
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println(ch + " is a vowel.");
			break;
			default:
				System.out.println(ch + " is a consonant.");
		}
	}
}

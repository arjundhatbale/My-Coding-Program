package com.TypeConversion;

// Display  the uppercase and lowercase charactor

public class DisplayChar {

	public static void main(String[] args) {
		
		System.out.println("Display Uppercase charactor : ");
		
		for(char ch = 'A'; ch <= 'Z'; ++ch) {
			System.out.print(ch + ", ");
		}
		 
		System.out.println("\nDisplay Lowercase charactor : ");
		for(char ch = 'a'; ch <= 'z'; ++ch) {
			System.out.print(ch + ", ");
		}
	}
}

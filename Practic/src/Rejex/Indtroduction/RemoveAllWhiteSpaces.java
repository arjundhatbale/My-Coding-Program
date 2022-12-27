package com.Indtroduction;
import java.util.Scanner;
public class RemoveAllWhiteSpaces {
	
	// Take string from users and remove the white space
	
	void m() {
		System.out.println("Enter a String statement : ");
		// input string statement
		Scanner input = new Scanner(System.in);
		String statement = input.nextLine();
		
		statement = statement.replaceAll("\\s","");
		System.out.println("New input statement is : " + statement);
		
	}
    public static void main(String[] args) {
    	String statement = "My village name is Chapaner. ";
        
        System.out.println("Original senctence is : " + statement);
        
        statement = statement.replaceAll("\\s","");
        System.out.println("New sentence is : " + statement);
        
        RemoveAllWhiteSpaces obj = new RemoveAllWhiteSpaces();
        obj.m();
	}
}

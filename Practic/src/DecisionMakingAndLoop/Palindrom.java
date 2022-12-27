package com.DecisionMakingAndLoop;

// calculate the Palindrom of string 

public class Palindrom {

	public static void main(String[] args) {
		
		System.out.println("JAVA Program to check Palindrom String :");
		String str = "Radar";
		String ReverseString = "";
		
		int strLenght = str.length();
		
		for(int i= (strLenght - 1); i >= 0; i--){
			ReverseString = ReverseString + str.charAt(i);
		}
		
		if(str.toLowerCase().equals(ReverseString.toLowerCase())) {
			System.out.println(str + " is a Palindrom String.");
		}else {
			System.out.println(str + " is not a Palindrom String.");
		}
		 Palindrom obj = new  Palindrom ();
		 obj.m();
		 
	}
	static void m(){
		System.out.println("JAVA Program to check Palindrom Integer");
		
		int num = 2332;
		int ReverseNum = 0;
		int Reminder;
		
		// Store the number to originalNUm
		int OriginalNum = num;
		
		// get the reverse of OriginalNum
		// Store it in variable
		while(num != 0){
			Reminder = num % 10;
			ReverseNum = ReverseNum * 10 + Reminder;
			num = num / 10;
		}
		
		// check if ReverseNum and OriginalNum are equal
		if(OriginalNum == ReverseNum) {
			System.out.println(OriginalNum + " is Palindrom number.");
		}else {
			System.out.println(OriginalNum + " is Not a Palindrom number.");
			 
		}
	}
}

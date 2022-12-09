package com.Functions;

// java program to find palindrom

public class Palindrom {
	public static void main(String[] args) {	
		 String name = "vishal"; // nayan is palindrom String name :
		 
		 String reverse = "";
		 int length = name.length();
		 
		 for(int i = (length - 1); i >= 0; i--) {
			 reverse =  reverse + name.charAt(i) ;
		 }
		 System.out.println("reverse : >> " + reverse);
		 if(name == reverse) {
			 System.out.println("This is palindrom");
		 }else {
			 System.out.println("This is not palidrom");
		 }
	}
}

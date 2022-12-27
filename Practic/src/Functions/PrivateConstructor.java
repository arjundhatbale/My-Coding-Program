package com.Functions;

// java program to create a private constructor

class Test{
	
	// create a private Constructor
	private Test() {
		System.out.println("This is Private Constructor");
	}
	
	// create a public method to create a object of Test call to call the private constructor
	// Note : Make this method static because if we make it static then there is no need to create object to call this method for Test class 
	// Whenever we Call the Test class then automatically the public static void m() method is call so that inside this m() methode we assign the Create object of private constructor so automatically private constructor is called.
	public static void m() {
		Test object = new Test();
	}
}
class PrivateConstructor {
	public static void main(String[] args) {
		Test.m();
		
	}
	
}

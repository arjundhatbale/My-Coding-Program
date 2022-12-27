package com.Object_and_Classes;

public class InitializationBlock extends su {

	{
		System.out.println("Instance initialization Block");
	}
	static {
		System.out.println("Static 2n Initialization block");
	}
	public InitializationBlock() {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		InitializationBlock obj = new InitializationBlock();
		System.out.println("After Main Method");
		
	}
}
class su{
	public su() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent class constructor");
	}
	{
		System.out.println("Parent class initialisation box");
	}
	static {
		System.out.println("Static parent initilisation box");
	}
}

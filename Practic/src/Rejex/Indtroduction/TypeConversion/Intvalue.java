package com.TypeConversion;

// convert long to int by using .intValue()

public class Intvalue {
	public static void main(String[] args) {
		
		// long variable
		Long object = 23445234235L;
		
		// convert obj3ct of long into int 
		
		int a = object.intValue();
		
		System.out.println(a);
		
		
		int no = 25;
		
		long l = (int)no;
		System.out.println("long value of l is >> " + l);
	}
}

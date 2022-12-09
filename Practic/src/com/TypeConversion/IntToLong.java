package com.TypeConversion;

public class IntToLong {
	
	public static void main(String[] args) {
		
		// convert int to long by useing type casting
		
		// take int variable
		
		int no1 = 23;
		
		// take long variable 
		// convert int to long by type casting
		
		//long l1 = (long)no1;
		long c = no1;
		// print output
		
		// System.out.println(l1);
		System.out.println(c);
		IntToLong obj = new IntToLong();
		obj.IntToLongUsingvalueof();
	}
	void IntToLongUsingvalueof () {
		int a = 352;
		// convert to an object of long 
		// using valueOf();
		
		Long obj = Long.valueOf(a);
		
		System.out.println(obj);
	}
}

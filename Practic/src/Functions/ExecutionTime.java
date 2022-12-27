package com.Functions;

// Java Program to calculate the method execution time

public class ExecutionTime {

	// create a method 
	public void display() {
		System.out.println("Calculating Method Execution time.");
	}
	// main method
	public static void main(String[] args) {
		
		ExecutionTime obj = new ExecutionTime();
		
		// get the start time
		
		long start = System.nanoTime();
		
		// call method 
		obj.display();
		
		// get the end time
		
		long end = System.nanoTime();
		
		// Execution time
		long execution = end - start;
		System.out.println("Execution time : " + execution + " nanosecnd.");
	}
}

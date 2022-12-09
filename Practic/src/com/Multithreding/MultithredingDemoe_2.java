package com.Multithreding;

// Java code for thread creation by implementing the runnable 
// Interface

public class MultithredingDemoe_2 implements Runnable {

	public void run() {
		try {
			// Displaying the thread that is running 
			
			System.out.println(" Thread " + Thread.currentThread().getId() + " is Running");
		}catch(Exception e) {
			System.out.println("Exception is caught.");
		}
	}
}

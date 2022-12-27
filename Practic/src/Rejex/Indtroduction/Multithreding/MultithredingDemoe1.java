package com.Multithreding;

// Java code for thread creating by extending the Thread class

public class MultithredingDemoe1 extends Thread {

	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running. ");
		} catch (Exception e) {
			System.out.println("Exception is caught >> " + e);
		}
	}
}

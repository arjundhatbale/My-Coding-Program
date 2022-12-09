package com.Multithreding;

public class Multithread_1 {

	public static void main(String[] args) {
		
		int n = 8; // Number of threads
		for(int i = 0; i< n; i++) {
			MultithredingDemoe1  object = new MultithredingDemoe1 ();
			object.start();
		}
	}
}

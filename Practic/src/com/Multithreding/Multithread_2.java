package com.Multithreding;

public class Multithread_2 {

	public static void main(String[] args) {
		
		int n = 9;
		for(int i = 0; i< n ; i++) {
			
			Thread object = new Thread(new MultithredingDemoe_2());
			object.start();
			
		}
	}
}

package com.Multithreding;

public class ThreadExaple2  extends Thread {

	public void  run() {				// Inbuilt run() method name is run();
		for(int i = 0; i<= 5; i++) {
			try {
				Thread.sleep(800);// it will pause the thread 
				     				// execution for particular milliseconds
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadExaple2 thread1 = new ThreadExaple2();
		
		ThreadExaple2 thread2 = new ThreadExaple2();
		
		thread1.start();
		thread2.start();
		
	}
}

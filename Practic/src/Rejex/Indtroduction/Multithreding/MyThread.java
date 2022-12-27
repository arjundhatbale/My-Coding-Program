package com.Multithreding;

public class MyThread extends Thread {

	int sum = 0; 
	public void run() {
		synchronized(this) {
			for(int i =0 ; i <=5; i++) {
				sum = sum + 10;
			}
			this.notify();
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
	
		thread.start();
		 
		
		synchronized(thread) {
			thread.wait();
			System.out.println(thread.sum);
		}
	}
}

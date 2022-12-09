package com.Multithreding;

public class ThreadDemo extends Thread {
 
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo thread  = new ThreadDemo();
		thread.start();
	}
}

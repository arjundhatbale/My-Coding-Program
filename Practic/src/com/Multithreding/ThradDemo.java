package com.Multithreding;

public class ThradDemo  implements Runnable {

	public static void main(String[] args) {
		
		ThradDemo thread = new ThradDemo();
		Thread t = new Thread(thread);
		t.start();
	}
	public void run() {
		for(int j = 0; j <=  8; j++) {
			System.out.println(j);
		}
	}
}

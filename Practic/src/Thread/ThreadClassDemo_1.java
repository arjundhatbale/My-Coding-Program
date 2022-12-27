package com.Thread;

class Thread1 implements Runnable {
	Thread t;
	Thread1(){
		t = new Thread(this,"First Thread ");
		System.out.println("Child : " + t);
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int i = 0 ; i < 5; i++) {
				System.out.println("Child : " + i);
				Thread.sleep(800);
			}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Child Terminated");
	}
	 
}
public class ThreadClassDemo_1 {
	public static void main(String[] args) {
		new Thread1();
		try {
			for(int i = 0 ; i < 5; i++) {
				System.out.println("Main : " + i);
				Thread.sleep(200);
			}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Terminated");
	}
}

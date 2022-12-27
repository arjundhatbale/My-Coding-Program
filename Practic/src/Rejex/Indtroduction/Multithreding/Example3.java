package com.Multithreding;

public class Example3 extends Thread {

	public static void main(String[] args) {
		
		Example3 thread = new Example3();
		
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		System.out.println(thread.getClass());
		System.out.println(thread.getThreadGroup());
	}
}

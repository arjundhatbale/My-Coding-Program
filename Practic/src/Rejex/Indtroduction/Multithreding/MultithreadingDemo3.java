package com.Multithreding;
class hi extends Thread{
	public void run () {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Hello extends Thread {
	public void run() {
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Hellow");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	 
}
public class MultithreadingDemo3 {
	 
	public static void main(String[] args) throws Throwable {
		hi obj1 = new hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		try {Thread.sleep(10);
		}catch(Exception e) {}
		obj2.start();
		
		 
	}
}

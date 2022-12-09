package com.Functions;

// find the prime no

public class PrimeNO {

	public static void main(String[] args) {
		
		
		int num = 29;
		boolean flag = false;
		for(int i = 2; i <= num / 2; i++) {
			
			// condition for nonprime number
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num + " is a prime number.");
		}else {
			System.out.println(num + " is not prime number.");
		}
		PrimeNO obj = new PrimeNO ();
		obj.m();
	}
	void m() {
		System.out.println("Check prime no by using while loop");
		
		int num = 29;
		boolean flag = true;
		int i = 2;
		while(i <= num / 2) {
			if(num % i == 0) {
				flag = false;
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println(num + " is a prime number.");
		}else {
			System.out.println(num + " is Not prime number.");
		}
		
	}
}
